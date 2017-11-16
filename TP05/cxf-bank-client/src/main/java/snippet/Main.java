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
		
		//Vidage des données de la database pour éviter de restart le serveur
		ibank.emptyDatabase();
		
		/* Creation de client + compte associé */
		Client vinz = ibank.createClient("Vinz", "Pwet", date2);
		Account accVinz = ibank.createAccount(vinz, AccountType.LIVRET_A);	
		
		Client soso = ibank.createClient("Soso", "cas", date2);
		Account accSoso = ibank.createAccount(soso, AccountType.LIVRET_A);
		
		System.out.println("--------------CREATION DONE---------------");
		
		ibank.createAccount(soso, AccountType.LIVRET_JEUNE);
		
		System.out.println(ibank.displayDatabase());
		
		/*Ajout d'argent sur le compte de soso  et vinz*/		

		//soso = ibank.recoverClient("Soso", "cas", date2);		
		accSoso = ibank.recoverAccount(soso, AccountType.LIVRET_A);
		ibank.addMoney(accSoso, 100);
		
		vinz = ibank.recoverClient("Vinz", "Pwet", date2);		
		accVinz = ibank.recoverAccount(vinz, AccountType.LIVRET_A);
		ibank.addMoney(accVinz, 50);
		
		/*Retrait d'argent sur le compte de soso*/
		accSoso = ibank.recoverAccount(soso, AccountType.LIVRET_A);
		ibank.removeMoney(accSoso, 10);
		
		System.out.println(ibank.displayDatabase());
		
		
		/*Virement interne sur le compte de soso */
		
		ibank.virementInternAcc(soso, AccountType.LIVRET_A, AccountType.LIVRET_JEUNE, 20);
		
		System.out.println(ibank.displayDatabase());
		
		/* virement entre le compte de soso et vinz
		 * 
		 */
		soso = ibank.recoverClient("Soso", "cas", date2);	
		vinz = ibank.recoverClient("Vinz", "Pwet", date2);	
		accVinz = ibank.recoverAccount(vinz, AccountType.LIVRET_A);
		accSoso = ibank.recoverAccount(soso, AccountType.LIVRET_A);
		
		ibank.virementBetweenAcc(soso, accSoso, vinz, accVinz, 10);
		

		System.out.println(ibank.displayDatabase());
	}
}
