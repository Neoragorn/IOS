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
import Model.ManageException;
import bankInterface.IBank;
import persistence.Database;

public class Bank implements IBank {

	@Override
	public Client createClient(String prenom, String nom, Calendar date) throws ClientAlreadyExistException {
		List<Client> list = Database.getInstance().getListClient();
		Client clTmp = new Client(nom, prenom, date);
		if (ManageException.checkClientAlreadyExist(list, clTmp))	
			throw new ClientAlreadyExistException("Ce client existe déja sous ce prenom, nom et date de naissance");
		Database.getInstance().getListClient().add(clTmp);
		return clTmp;
	}

	@Override
	public Client recoverClient(String prenom, String nom, Calendar date) throws ClientDoNotExistException {
		List<Client> list = Database.getInstance().getListClient();	

		Client cl = ManageException.checkClientExist(list, prenom, nom, date);

		if (cl == null)
			throw new ClientDoNotExistException("Client non trouvé");
		
		return cl;
	}

	@Override
	public Account createAccount(Client cl, AccountType acc) throws ClientDoNotExistException, TypeOfAccountDoNotExistException, TypeOfAccountAlreadyExistForClientException {
		List<Client> list = Database.getInstance().getListClient();

		//Verification client existe
		Client clTmp = ManageException.checkClientExistInData(list, cl);
		if (clTmp == null)
			throw new ClientDoNotExistException("Client n'existe pas");
		//verification type de compte
		if (!ManageException.checkAccountType(acc))
			throw new TypeOfAccountDoNotExistException("Ce type de compte n'existe pas");

		//verification client a deja ce type de compte
		if (clTmp.checkTypeAcc(acc))
			throw new TypeOfAccountAlreadyExistForClientException("Le Client possède déjà un compte de ce type");

		Account newAcc = new Account(cl, acc);
		Database.getInstance().getListClient().get(Database.getInstance().getListClient().indexOf(clTmp)).getListCount().add(newAcc);
		Database.getInstance().getListAcc().add(newAcc);
		return newAcc;
	}

	@Override
	public Account recoverAccount(Client cl, AccountType acc) throws ClientDoNotExistException, TypeOfAccountDoNotExistException, AccountDoNoExistException {
		List<Client> list = Database.getInstance().getListClient();

		Client clTmp = ManageException.checkClientExistInData(list, cl);
		if (clTmp == null)
			throw new ClientDoNotExistException("Client n'existe pas");
		if (!ManageException.checkAccountType(acc))
			throw new TypeOfAccountDoNotExistException("Ce type de compte n'existe pas");

		Account cmpt = ManageException.AccounTExistForClient(clTmp, acc);

		if (cmpt == null)		
			throw new AccountDoNoExistException("Ce type de compte n'existe pas pour ce client");
		return cmpt;
	}

	@Override
	public int addMoney(Account acc, int amount) throws AccountDoNoExistException, SoldeIsNotCorrectException {
		List<Account> list = Database.getInstance().getListAcc();

		if (!ManageException.AmountIsRight(amount))
			throw new SoldeIsNotCorrectException("Le montant doit être supérieur à 0");

		Account ac = ManageException.AccountExist(list, acc);
		if (ac == null)
			throw new AccountDoNoExistException("Ce compte n'existe pas");
		ac.setSolde(acc.getSolde() + amount);
		ManageException.updateDatabaseAccountToClientList(Database.getInstance().getListClient(), ac, ac.getClient());
		return ac.getSolde();
	}

	@Override
	public int removeMoney(Account acc, int amount)
			throws AccountDoNoExistException, SoldeIsNotCorrectException, AccountInRedException {
		List<Account> list = Database.getInstance().getListAcc();

		if (!ManageException.AmountIsRight(amount))
			throw new SoldeIsNotCorrectException("Le montant doit être supérieur à 0");

		Account ac = ManageException.AccountExist(list, acc);
		if (ac == null)
			throw new AccountDoNoExistException("Ce compte n'existe pas");

		if (ManageException.AccountIsInRed(acc, amount))
			throw new AccountInRedException("Impossible de retirer, découvert non autorisé");

		ac.setSolde(acc.getSolde() - amount);
		ManageException.updateDatabaseAccountToClientList(Database.getInstance().getListClient(), ac, ac.getClient());
		return acc.getSolde();
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

		if (!ManageException.AmountIsRight(amount))
			throw new SoldeIsNotCorrectException("Le montant doit être supérieur à 0");

		Client clTmp = ManageException.checkClientExistInData(listClient, cl1);

		if (clTmp == null)
			throw new ClientDoNotExistException("Client n'existe pas");

		if (!ManageException.checkAccountType(acc1))
			throw new AccountDoNoExistException("Ce type de compte n'existe pas");

		if (!ManageException.checkAccountType(acc2))
			throw new AccountDoNoExistException("Ce type de compte n'existe pas");

		if (!ManageException.AccountTypeIsLinkedToClient(clTmp, acc1))
			throw new AccountNotLinkedToTheClientException("Le type de compte " + acc1 + " n'est pas présent chez le client");

		if (!ManageException.AccountTypeIsLinkedToClient(clTmp, acc2))
			throw new AccountNotLinkedToTheClientException("Le type de compte " + acc2 + " n'est pas présent chez le client");


		List<Account> clAccList = clTmp.getListCount();
		Account accTmp1 = new Account();
		Account accTmp2 = new Account();

		for (Account acc : clAccList)
		{
			if (acc.getType().equals(acc1))
			{
				if (ManageException.AccountIsInRed(acc, amount))
					throw new AccountInRedException("Impossible de retirer, découvert non autorisé");
				accTmp1 = acc;
			}
			if (acc.getType().equals(acc2))
				accTmp2 = acc;
		}

		accTmp1.setSolde(accTmp1.getSolde() - amount);
		accTmp2.setSolde(accTmp2.getSolde() + amount);
		ManageException.updateDatabaseAccountToClientList(Database.getInstance().getListClient(), accTmp1, cl1);
		ManageException.updateDatabaseAccountToClientList(Database.getInstance().getListClient(), accTmp2, cl1);
	}

	@Override
	public void virementBetweenAcc(Client cl1, Account acc1, Client cl2, Account acc2, int amount)
			throws AccountNotLinkedToTheClientException, AccountInRedException, SoldeIsNotCorrectException,
			ClientDoNotExistException, AccountDoNoExistException {
		List<Client> listClient = Database.getInstance().getListClient();


		if (!ManageException.AmountIsRight(amount))
			throw new SoldeIsNotCorrectException("Le montant doit être supérieur à 0");

		Client clTmp = ManageException.checkClientExistInData(listClient, cl1);
		if (clTmp == null)
			throw new ClientDoNotExistException("Client " + cl1.getPrenom()  + " n'existe pas");

		Client clTmp2 = ManageException.checkClientExistInData(listClient, cl2);
		if (clTmp2 == null)
			throw new ClientDoNotExistException("Client " + cl2.getPrenom()  + " n'existe pas");

		Account ac = ManageException.AccountExist(cl1.getListCount(), acc1);
		if (ac == null)
			throw new AccountDoNoExistException("Ce compte n'existe pas");

		Account ac2 = ManageException.AccountExist(cl2.getListCount(), acc2);
		if (ac2 == null)
			throw new AccountDoNoExistException("Ce compte n'existe pas");

		if (!ManageException.AccountIsLinkedToClient(cl1, acc1))
			throw new AccountNotLinkedToTheClientException("Le compte N°1 n'est pas lié au bon client");

		if (!ManageException.AccountIsLinkedToClient(cl2, acc2))
			throw new AccountNotLinkedToTheClientException("Le compte N°2 n'est pas lié au bon client");

		if (ManageException.AccountIsInRed(acc1, amount))
			throw new AccountInRedException("Impossible de retirer, découvert non autorisé");


		ac.setSolde(ac.getSolde() - amount);
		ac2.setSolde(ac2.getSolde() + amount);

		ManageException.updateDatabaseAccountToClientList(listClient, ac, clTmp);
		ManageException.updateDatabaseAccountToClientList(listClient, ac2, clTmp2);
	}

	@Override
	public int closeAccount(Account acc) throws AccountDoNoExistException {
		List<Account> list = Database.getInstance().getListAcc();
		List<Client> listClient = Database.getInstance().getListClient();
		
		Account ac = ManageException.AccountExist(list, acc);

		if (ac == null)
			throw new AccountDoNoExistException("Ce compte n'existe pas");

		Account acCl = new Account();
		Client cl = null;
		
		for (Client clTmp : listClient)
		{
			if (clTmp.equals(ac.getClient()))
				cl = clTmp;
		}
		
		for (Account cmpt : cl.getListCount())
		{
			if (ac.equals(cmpt))
				acCl = cmpt;
		}

		cl.getListCount().remove(acCl);
		Database.getInstance().getListAcc().remove(ac);
		return ac.getSolde();
	}

	@Override
	public void eraseClient(Client cl1) throws ClientStillHasAnAccountException, ClientDoNotExistException {
		List<Client> list = Database.getInstance().getListClient();

		Client clTmp = ManageException.checkClientExistInData(list, cl1);
		if (clTmp == null)
			throw new ClientDoNotExistException("Client " + cl1.getPrenom()  + " n'existe pas");
		
		if (clTmp.getListCount().isEmpty())
		{
			Database.getInstance().getListClient().remove(clTmp);
			return;
		}

		throw new ClientStillHasAnAccountException("Suppression du client impossible. Le client possède toujours des comptes non-fermés");		
	}

	@Override
	public String displayDatabase() {
		return Database.getInstance().displayDatabase();

	}

	@Override
	public void emptyDatabase()
	{
		Database.getInstance().emptyData();
	}
}
