package ios.client;

import javax.xml.datatype.XMLGregorianCalendar;

public class Main {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClientAlreadyExistException_Exception, TypeOfAccountDoNotExistException_Exception, ClientDoNotExistException_Exception, TypeOfAccountAlreadyExistForClientException_Exception
	{
		
		BankServiceClient bank = new BankServiceClient();
		
		/*IBank ibank = (IBank) bank.getInterfaceBank();
		
		Client soso = ibank.createClient("Soso", "cas", XMLGregorianCalendar.class.newInstance());
		ibank.createAccount(soso, AccountType.LIVRET_A);
		
		ibank.displayDatabase();*/
		
		/*Database.getInstance().displayDatabase();
		
		Client soso = bank.createClient("Soso", "cas", Calendar.getInstance());
		Client vinz = bank.createClient("Vinz", "Pwet", Calendar.getInstance());
		
		bank.createAccount(soso, AccountType.LIVRET_A);
		bank.createAccount(vinz, AccountType.LIVRET_A);
		
		List<Account> listaccSoso = soso.getListCount();
		List<Account> listaccVinz = vinz.getListCount();
		bank.addMoney(listaccSoso.get(0), 100);

		Database.getInstance().displayDatabase();
		
		bank.createAccount(soso, AccountType. LIVRET_JEUNE);
		bank.virementInternAcc(soso, AccountType.LIVRET_A, AccountType.LIVRET_JEUNE, 20);
		
		Database.getInstance().displayDatabase();
		
		bank.virementBetweenAcc(soso, listaccSoso.get(0), vinz, listaccVinz.get(0), 20);
		Database.getInstance().displayDatabase();*/
	}
}
