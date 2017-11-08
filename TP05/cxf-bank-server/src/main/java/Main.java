import java.util.Calendar;
import java.util.List;

import Exception.AccountDoNoExistException;
import Exception.AccountInRedException;
import Exception.AccountNotLinkedToTheClientException;
import Exception.ClientAlreadyExistException;
import Exception.ClientDoNotExistException;
import Exception.SoldeIsNotCorrectException;
import Exception.TypeOfAccountAlreadyExistForClientException;
import Exception.TypeOfAccountDoNotExistException;
import Model.Account;
import Model.AccountType;
import Model.Client;
import bankInterface.IBank;
import ios.bank.server.BankImpl;
import persistence.Database;

public class Main {
	
	private static IBank bank = new BankImpl();
	
	public static void main(String[] args) throws ClientAlreadyExistException, ClientDoNotExistException,
	TypeOfAccountDoNotExistException, TypeOfAccountAlreadyExistForClientException, AccountDoNoExistException,
	SoldeIsNotCorrectException, AccountNotLinkedToTheClientException, AccountInRedException
	{
		Database.getInstance().displayDatabase();
		
		Client soso = bank.createClient("Soso", "cas", Calendar.getInstance());
		Client vinz = bank.createClient("Vinz", "Pwet", Calendar.getInstance());
		
		bank.createAccount(soso, AccountType.LIVRET_A);
		bank.createAccount(vinz, AccountType.LIVRET_A);
		
		List<Account> listacc = soso.getListCount();
		bank.addMoney(listacc.get(0), 100);
		
		bank.createAccount(soso, AccountType. LIVRET_JEUNE);
		bank.virementInternAcc(soso, AccountType.LIVRET_A, AccountType.LIVRET_JEUNE, 50);
		
		Database.getInstance().displayDatabase();
	}
}
