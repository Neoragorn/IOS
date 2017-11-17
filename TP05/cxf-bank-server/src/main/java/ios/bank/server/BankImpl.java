package ios.bank.server;

import java.util.Calendar;

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

public class BankImpl {

	private Bank bank = new Bank();
	
	public Client createClient(String prenom, String nom, Calendar date) throws ClientAlreadyExistException {
		return this.bank.createClient(prenom, nom, date);
		
	}

	public Client recoverClient(String prenom, String nom, Calendar date) throws ClientDoNotExistException {
		
		return this.bank.recoverClient(prenom, nom, date);
	}

	public Account createAccount(Client cl, AccountType acc) throws ClientDoNotExistException, TypeOfAccountDoNotExistException, TypeOfAccountAlreadyExistForClientException {
		return this.bank.createAccount(cl, acc);
	}

	public Account recoverAccount(Client cl, AccountType acc) throws ClientDoNotExistException, TypeOfAccountDoNotExistException, AccountDoNoExistException {
		return this.bank.recoverAccount(cl, acc);
	}

	public int addMoney(Account acc, int amount) throws AccountDoNoExistException, SoldeIsNotCorrectException {
		return this.bank.addMoney(acc, amount);
	}

	public int removeMoney(Account acc, int amount)
			throws AccountDoNoExistException, SoldeIsNotCorrectException, AccountInRedException {
		return this.bank.removeMoney(acc, amount);
	}

	public int displaySolde(Account acc) throws AccountDoNoExistException {
		return this.bank.displaySolde(acc);
	}

	public void virementInternAcc(Client cl1, AccountType acc1, AccountType acc2, int amount)
			throws AccountNotLinkedToTheClientException, AccountInRedException, SoldeIsNotCorrectException,
			ClientDoNotExistException, AccountDoNoExistException {
		this.bank.virementInternAcc(cl1, acc1, acc2, amount);
	}

	public void virementBetweenAcc(Client cl1, Account acc1, Client cl2, Account acc2, int amount)
			throws AccountNotLinkedToTheClientException, AccountInRedException, SoldeIsNotCorrectException,
			ClientDoNotExistException, AccountDoNoExistException {
		this.bank.virementBetweenAcc(cl1, acc1, cl2, acc2, amount);
	}

	public int closeAccount(Account acc) throws AccountDoNoExistException {
		return this.bank.closeAccount(acc);
	}

	public void eraseClient(Client cl1) throws ClientStillHasAnAccountException, ClientDoNotExistException {
		this.bank.eraseClient(cl1);
	}

	public String displayDatabase() {
		return this.bank.displayDatabase();

	}

	public void emptyDatabase()
	{
		this.bank.emptyDatabase();
	}
}
