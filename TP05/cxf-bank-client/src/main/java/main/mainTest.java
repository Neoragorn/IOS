package main;

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
import ios.client.ClientStillHasAnAccountException_Exception;
import ios.client.IBank;
import ios.client.SoldeIsNotCorrectException_Exception;
import ios.client.TypeOfAccountAlreadyExistForClientException_Exception;
import ios.client.TypeOfAccountDoNotExistException_Exception;

public class mainTest {

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
		
		//test qui verifie qu'on ne peut créer 2x le même client
		try
		{
			Client vinz = ibank.createClient("Vinz", "Pwet", date2);

			Client soso = ibank.createClient("Vinz", "Pwet", date2);
		}
		catch (ClientAlreadyExistException_Exception e)
		{
			System.out.println("Test 1 : " + e);
		}

		//Test qui verifie l'existence d'un client
		try
		{
			Client lambda = ibank.recoverClient("gamma", "beta", date2);
		}
		catch (ClientDoNotExistException_Exception e)
		{
			System.out.println("Test 2 : " + e);
		}
		
		//Test qui verifie l'exitence d'un compte chez un client
		try
		{
			Client soso = ibank.createClient("soso", "cas", date2);
			
			Account accl = ibank.recoverAccount(soso, AccountType.LIVRET_A);
		}
		catch (AccountDoNoExistException_Exception e)
		{
			System.out.println("Test 3 : " + e);
		}
		
		//Test qui verifie si un type de compte existe deja chez un client
		try
		{
			Client soso = ibank.recoverClient("soso", "cas", date2);
			Account accSoso1 = ibank.createAccount(soso, AccountType.LIVRET_A);
			Account accSoso2 = ibank.createAccount(soso, AccountType.LIVRET_A);
			
		}
		catch (TypeOfAccountAlreadyExistForClientException_Exception e)
		{
			System.out.println("Test 4 : " + e);
		}
		
		/** TEST pour l'ecriture du type de compte, mais je ne voyais pas comment le tester réellement

		try
		{
			
			Client soso = ibank.recoverClient("soso", "cas", date2);
			//Account accSoso1 = ibank.createAccount(soso, AccountTypeTest);
		}
		catch (TypeOfAccountDoNotExistException_Exception e)
		{
			System.out.println("Test 5 : " + e);
		}
		*/
		
		//Test qui verifie si un type de compte donné lors d'une opération est présent chez un client
		try
		{

			Client soso = ibank.recoverClient("soso", "cas", date2);
			ibank.virementInternAcc(soso, AccountType.LIVRET_A, AccountType.LIVRET_DEVELOPPEMENT_DURABLE, 10);
			
		}
		catch (AccountNotLinkedToTheClientException_Exception e)
		{
			System.out.println("Test 5 : " + e);
		}
		
		//Test qui verifie si un montant donné est correct pour une opération
		try
		{
			Client soso = ibank.recoverClient("soso", "cas", date2);
			ibank.virementInternAcc(soso, AccountType.LIVRET_A, AccountType.LIVRET_DEVELOPPEMENT_DURABLE, -10);
		}
		
		catch (SoldeIsNotCorrectException_Exception e)
		{
			System.out.println("Test 6 : " + e);
		}
		
		//Test qui verifie si un compte ne tombe pas en découvert pour une opération
		try
		{
			
			Client soso = ibank.recoverClient("soso", "cas", date2);
			
			Account accSoso2 = ibank.createAccount(soso, AccountType.LIVRET_JEUNE);
			
			Account accl = ibank.recoverAccount(soso, AccountType.LIVRET_A);
			ibank.addMoney(accl, 20);			
			
			ibank.virementInternAcc(soso, AccountType.LIVRET_A, AccountType.LIVRET_JEUNE, 60);
		}
		catch (AccountInRedException_Exception e)
		{
			System.out.println("Test 7 : " + e);
		}
		
		//Test qui verifie si un client a effectivement tous ses comptes fermes avant d'être efface lui-même
		try
		{
			Client soso = ibank.recoverClient("soso", "cas", date2);
			ibank.eraseClient(soso);
		}
		catch (ClientStillHasAnAccountException_Exception e)
		{
			System.out.println("Test 8 : " + e);
		}

		System.out.println("EXCEPTION TEST FINISHED");
	}
}
