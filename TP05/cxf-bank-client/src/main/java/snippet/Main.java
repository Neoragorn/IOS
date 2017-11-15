package snippet;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import ios.client.Account;
import ios.client.AccountDoNoExistException_Exception;
import ios.client.AccountInRedException_Exception;
import ios.client.AccountNotLinkedToTheClientException_Exception;
import ios.client.AccountType;
import ios.client.Client;
import ios.client.ClientAlreadyExistException_Exception;
import ios.client.ClientDoNotExistException_Exception;
import ios.client.IBank;
import ios.client.SoldeIsNotCorrectException_Exception;
import ios.client.TypeOfAccountAlreadyExistForClientException_Exception;
import ios.client.TypeOfAccountDoNotExistException_Exception;

public class Main {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClientAlreadyExistException_Exception, TypeOfAccountDoNotExistException_Exception, ClientDoNotExistException_Exception, TypeOfAccountAlreadyExistForClientException_Exception, SoldeIsNotCorrectException_Exception, AccountDoNoExistException_Exception, AccountInRedException_Exception, AccountNotLinkedToTheClientException_Exception, DatatypeConfigurationException
	{
		
		BankServiceClient bank = new BankServiceClient();
		
		GregorianCalendar c = new GregorianCalendar();
		Date d = new Date();
		d.setTime(d.getTime());		
		c.setTime(d);
		
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		
		IBank ibank = (IBank) bank.getInterfaceBank();
		
		System.out.println(ibank.displayDatabase());
		
		//On crée le client soso
		
		Client soso = ibank.createClient("Soso", "cas", date2);

		ibank.createAccount(soso, AccountType.LIVRET_A);
		ibank.createAccount(soso, AccountType.LIVRET_JEUNE);
		System.out.println(ibank.displayDatabase());

		
		Client vinz = ibank.createClient("Vinz", "Pwet", date2);
		

		//on cree le client Vinz
		ibank.createAccount(vinz, AccountType.LIVRET_A);

		vinz = ibank.recoverClient("Vinz", "Pwet", date2);
		System.out.println("test 3 Done");
		
		soso = ibank.recoverClient("Soso", "cas", date2);
		Account accSoso = ibank.recoverAccount(soso, AccountType.LIVRET_A);
		
		System.out.println("test 4 Done");				
		
		Account accVinz = ibank.recoverAccount(vinz, AccountType.LIVRET_A);

		System.out.println("test 5 Done");
		
		ibank.addMoney(accSoso, 100);
		soso = ibank.recoverClient("Soso", "cas", date2);
		
		System.out.println("test 6 Done");
		
		System.out.println(ibank.displayDatabase());

		System.out.println("test 7 Done");
		
		ibank.virementInternAcc(soso, AccountType.LIVRET_A, AccountType.LIVRET_JEUNE, 20);
		
		soso = ibank.recoverClient("Soso", "cas", date2);
		accSoso = ibank.recoverAccount(soso, AccountType.LIVRET_A);
		System.out.println("test 9 Done");
		
		System.out.println(ibank.displayDatabase());
		
		ibank.virementBetweenAcc(soso, accSoso, vinz, accVinz, 10);
		
		System.out.println("test 10 Done");
		System.out.println(ibank.displayDatabase());
	}
}
