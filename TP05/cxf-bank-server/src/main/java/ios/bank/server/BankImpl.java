package ios.bank.server;

import java.util.Calendar;
import java.util.List;

import Exception.AccountDoNoExistException;
import Exception.AccountInRedException;
import Exception.AccountNotLinkedToTheClientException;
import Exception.ClientAlreadyExistException;
import Exception.ClientDoNotExistException;
import Exception.ClientStillHasAnAccountException;
import Exception.SoldeIsNotCorrectException;
import Exception.TypeOfAccountAlreadyExistForClientException;
import Exception.TypeOfAccountDoNotExistException;
import Model.Account;
import Model.AccountType;
import Model.Client;
import bankInterface.IBank;
import persistence.Database;

public class BankImpl implements IBank{

	@Override
	public Client createClient(String prenom, String nom, Calendar date) throws ClientAlreadyExistException {
		List<Client> list = Database.getInstance().getListClient();
		Client clTmp = new Client(nom, prenom, date);
		for (Client cl : list)
		{
			if (cl.equals(clTmp))				
				throw new ClientAlreadyExistException("Ce client existe déja sous ce prenom, nom et date de naissance");
		}
		Database.getInstance().getListClient().add(clTmp);
		return clTmp;
	}

	@Override
	public Client recoverClient(String prenom, String nom, Calendar date) throws ClientDoNotExistException {
		List<Client> list = Database.getInstance().getListClient();	

		for (Client cl : list)
		{
			if (cl.getPrenom().equals(prenom) && cl.getNom().equals(nom) && cl.getDatenaissance().equals(date))
				return cl;
		}
		throw new ClientDoNotExistException("Client non trouvé");
	}

	@Override
	public Account createAccount(Client cl, AccountType acc) throws ClientDoNotExistException, TypeOfAccountDoNotExistException, TypeOfAccountAlreadyExistForClientException {
		List<Client> list = Database.getInstance().getListClient();
		boolean check = false;
		int index = 0;

		//Verification client existe
		for (Client cl2 : list)
		{
			if (cl2.equals(cl))
			{
				check = true;
				break;
			}
			index++;
		}
		if (!check)
			throw new ClientDoNotExistException("Client n'existe pas");

		//verification type de compte
		for (AccountType type : AccountType.values())
		{
			if (acc.equals(type))
				check = true;
		}
		if (!check)
			throw new TypeOfAccountDoNotExistException("Ce type de compte n'existe pas");

		//verification client a deja ce type de compte
		if (cl.checkTypeAcc(acc))
			throw new TypeOfAccountAlreadyExistForClientException("Le Client possède déjà un compte de ce type");

		Account newAcc = new Account(cl, acc);
		Database.getInstance().getListClient().get(index).getListCount().add(newAcc);
		Database.getInstance().getListAcc().add(newAcc);
		return newAcc;
	}

	@Override
	public Account recoverAccount(Client cl, AccountType acc) throws ClientDoNotExistException, TypeOfAccountDoNotExistException, AccountDoNoExistException {
		List<Client> list = Database.getInstance().getListClient();
		boolean check = false;

		for (Client cl2 : list)
		{
			if (cl2.equals(cl))
				check = true;
		}
		if (!check)
			throw new ClientDoNotExistException("Client n'existe pas");

		check = false;
		for (AccountType type : AccountType.values())
		{
			if (acc.equals(type))
				check = true;
		}
		
		if (!check)
			throw new TypeOfAccountDoNotExistException("Le type de compte spécifié n'existe pas");
		check = false;
		for (Account cmpt : cl.getListCount())
		{
			System.out.println("Account type is => " + cmpt.getType() + " and acc is " + acc);
			if (acc.equals(cmpt.getType()))
			{
				check = true;
				return cmpt;
			}
		}
		
		throw new AccountDoNoExistException("Ce type de compte n'existe pas pour ce client");
	}

	@Override
	public int addMoney(Account acc, int amount) throws AccountDoNoExistException, SoldeIsNotCorrectException {
		List<Account> list = Database.getInstance().getListAcc();

		if (amount <= 0)
			throw new SoldeIsNotCorrectException("Le montant doit être supérieur à 0");
		for (Account cmpt : list)
		{
			if (acc.equals(cmpt))
			{
				cmpt.setSolde(acc.getSolde() + amount);
				return cmpt.getSolde();
			}
		}
		throw new AccountDoNoExistException("Ce compte n'existe pas");
	}

	@Override
	public int removeMoney(Account acc, int amount)
			throws AccountDoNoExistException, SoldeIsNotCorrectException, AccountInRedException {
		List<Account> list = Database.getInstance().getListAcc();

		if (amount <= 0)
			throw new SoldeIsNotCorrectException("Le montant doit être supérieur à 0");

		for (Account cmpt : list)
		{
			if (acc.equals(cmpt))
			{
				if (acc.getSolde() - amount < 0)
				{
					throw new AccountInRedException("Impossible de retirer, découvert non autorisé");
				}
				cmpt.setSolde(cmpt.getSolde() - amount);
				return cmpt.getSolde();
			}
		}
		throw new AccountDoNoExistException("Ce compte n'existe pas");
	}

	@Override
	public int displaySolde(Account acc) throws AccountDoNoExistException {
		List<Account> list = Database.getInstance().getListAcc();

		for (Account cmpt : list)
		{
			if (cmpt.equals(cmpt))
				return cmpt.getSolde();
		}
		throw new AccountDoNoExistException("Ce compte n'existe pas");
	}

	@Override
	public void virementInternAcc(Client cl1, AccountType acc1, AccountType acc2, int amount)
			throws AccountNotLinkedToTheClientException, AccountInRedException, SoldeIsNotCorrectException,
			ClientDoNotExistException, AccountDoNoExistException {
		List<Client> listClient = Database.getInstance().getListClient();
		Client clientTmp = new Client();

		boolean check1 = false;
		boolean check2 = false;
		boolean check3 = false;

		if (amount <= 0)
			throw new SoldeIsNotCorrectException("Le montant doit être supérieur à 0");

		//Verification que le client existe (check1) + Si les types de compte en paramètre sont présent chez le client (check2 + check3 )
		for (Client cl2 : listClient)
		{
			if (cl2.equals(cl1))
			{
				check1 = true;
				clientTmp = cl2;
				for (Account account : cl2.getListCount())
				{
					if (account.getType().equals(acc1))
						check2 = true;
					if (account.getType().equals(acc2))
						check3 = true;
				}
				break;
			}
		}

		if (!check1)
			throw new ClientDoNotExistException("Le client n'existe pas");

		if (!check2 || !check3)
			throw new AccountNotLinkedToTheClientException("L'un des types de compte n'est pas présent chez le client");

		check1 = false;
		check2 = false;

		//Verification de l'écriture du type de compte en paramètre
		
		for (AccountType type : AccountType.values())
		{
			if (acc1.equals(type))
				check1 = true;
			if (acc2.equals(type))
				check2 = true;
		}
		if (!check1 || !check2)
			throw new AccountDoNoExistException("L'un des types de compte n'existe pas");

		List<Account> clAccList = clientTmp.getListCount();
		Account accTmp1 = new Account();
		Account accTmp2 = new Account();

		for (Account acc : clAccList)
		{
			if (acc.getType().equals(acc1))
			{
				if (acc.getSolde() - amount < 0)
					throw new AccountInRedException("Opération impossible. Découvert non autorisé");
				accTmp1 = acc;
			}
			if (acc.getType().equals(acc2))
				accTmp2 = acc;
		}
		accTmp1.setSolde(accTmp1.getSolde() - amount);
		accTmp2.setSolde(accTmp2.getSolde() + amount);
	}

	@Override
	public void virementBetweenAcc(Client cl1, Account acc1, Client cl2, Account acc2, int amount)
			throws AccountNotLinkedToTheClientException, AccountInRedException, SoldeIsNotCorrectException,
			ClientDoNotExistException, AccountDoNoExistException {
		List<Client> listClient = Database.getInstance().getListClient();
		Account accTmp1 = new Account();
		Account accTmp2 = new Account();
		
		//check1 & check2 pour la vérification de l'existence des clients, check3 & check4 pour l'existence des comptes
		boolean check1 = false;
		boolean check2 = false;
		boolean check3 = false;
		boolean check4 = false;
		
		if (amount <= 0)
			throw new SoldeIsNotCorrectException("Le montant doit être supérieur à 0");
		
		for (Client cl : listClient)
		{
			if (cl.equals(cl1))
			{
				check1 = true;
				for (Account account : cl.getListCount())
				{
					if (account.equals(acc1))
					{check3 = true;
					if (!acc1.getClient().equals(cl1))					
						throw new AccountNotLinkedToTheClientException("Le compte N°1 n'est pas lié au bon client");
					accTmp1 = account;
					}
				}
			}
			if (cl.equals(cl2))
			{
				check2 = true;
				for (Account account : cl.getListCount())
				{
					if (account.equals(acc2))
					{
						check4 = true;
						if (!acc2.getClient().equals(cl2))
							throw new AccountNotLinkedToTheClientException("Le compte N°2 n'est pas lié au bon client");
						accTmp2 = account;
					}
				}
			}
		}
		if (!check1 || !check2)
			throw new ClientDoNotExistException("L'un des clients n'existe pas");
			
		if (!check3)
			throw new AccountDoNoExistException("Le compte de " + cl1.getNom() + " n'existe pas");
		
		if (!check4)
			throw new AccountDoNoExistException("Le compte de " + cl2.getNom() + " n'existe pas");
		
		if (accTmp1.getSolde() - amount < 0)
			throw new AccountInRedException("Opération impossible. Découvert non autorisé");
			
		accTmp1.setSolde(accTmp1.getSolde() - amount);
		accTmp2.setSolde(accTmp2.getSolde() + amount);
	}

	@Override
	public int closeAccount(Account acc) throws AccountDoNoExistException {
		List<Account> list = Database.getInstance().getListAcc();
		int index = 0;
		boolean check = false;
		for (Account cmpt : list)
		{
			if (acc.equals(cmpt))
			{
				check = true;
				break;
			}
			index++;
		}
		if (check)
		{
			Client cl = list.get(index).getClient();
			cl.getListCount().remove(list.get(index));
			Database.getInstance().getListAcc().remove(list.get(index));
			return acc.getSolde();
		}
		throw new AccountDoNoExistException("Ce compte n'existe pas");
	}

	@Override
	public void eraseClient(Client cl1) throws ClientStillHasAnAccountException, ClientDoNotExistException {
		List<Client> list = Database.getInstance().getListClient();
		boolean check = false;

		for (Client cl : list)
		{
			if (cl.equals(cl1))
				check = true;
		}

		if (!check)
			throw new ClientDoNotExistException("Client non trouvé");

		if (cl1.getListCount().isEmpty())
			Database.getInstance().getListClient().remove(cl1);

		throw new ClientStillHasAnAccountException("Suppression du client impossible. Le client possède toujours des comptes non-fermés");		
	}

	@Override
	public String displayDatabase() {
		return Database.getInstance().displayDatabase();
		
	}
}
