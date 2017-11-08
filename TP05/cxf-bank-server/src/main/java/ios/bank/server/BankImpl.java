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
	public Client createCustomer(String prenom, String nom, Calendar date) throws ClientAlreadyExistException {
		List<Client> list = Database.getInstance().getListClient();
		Client clTmp = new Client(nom, prenom, date);
		for (Client cl : list)
		{
			if (cl.equals(clTmp))
				return cl;
		}
		throw new ClientAlreadyExistException("Ce client existe déja sous ce prenom, nom et date de naissance");
	}

	@Override
	public Client recoverCustomer(String prenom, String nom, Calendar date) throws ClientDoNotExistException {
		List<Client> list = Database.getInstance().getListClient();
		for (Client cl : list)
		{
			if (cl.getPrenom().equals(prenom) && cl.getNom().equals(nom) && cl.getDatenaissance().equals(date))
				return cl;
		}
		throw new ClientDoNotExistException("Client non trouvé");
	}

	@Override
	public Account createAccount(Client cl, AccountType acc) throws ClientAlreadyExistException,
	ClientDoNotExistException, TypeOfAccountDoNotExistException, TypeOfAccountAlreadyExistForClientException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account recoverAccount(Client cl, AccountType acc) throws ClientAlreadyExistException,
	ClientDoNotExistException, TypeOfAccountDoNotExistException, AccountDoNoExistException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addMoney(Account acc, int amount) throws AccountDoNoExistException, SoldeIsNotCorrectException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeMoney(Account acc, int amount)
			throws AccountDoNoExistException, SoldeIsNotCorrectException, AccountInRedException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int displaySolde(Account acc) throws AccountDoNoExistException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void virementInternAcc(Client cl1, AccountType acc1, AccountType acc2, int amount)
			throws AccountNotLinkedToTheClientException, AccountInRedException, SoldeIsNotCorrectException,
			ClientDoNotExistException, AccountDoNoExistException {
		// TODO Auto-generated method stub

	}

	@Override
	public void virementBetweenAcc(Client cl1, Account acc1, Client cl2, Account acc2, int amount)
			throws AccountNotLinkedToTheClientException, AccountInRedException, SoldeIsNotCorrectException,
			ClientDoNotExistException, AccountDoNoExistException {
		// TODO Auto-generated method stub

	}

	@Override
	public int closeAccount(Account acc) throws AccountDoNoExistException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void eraseClient(Client cl1) throws ClientStillHasAnAccountException {
		// TODO Auto-generated method stub

	}

}
