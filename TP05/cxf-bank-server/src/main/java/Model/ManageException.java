package Model;

import java.util.Calendar;
import java.util.List;

import Exception.AccountInRedException;
import Exception.ClientAlreadyExistException;
import persistence.Database;

public class ManageException {

	public static boolean checkClientAlreadyExist(List<Client> clList, Client clTmp)
	{
		for (Client cl : clList)
		{
			if (cl.equals(clTmp))				
				return true;
		}
		return false;
	}

	public static Client checkClientExist(List<Client> clList, String prenom, String nom, Calendar date)
	{
		//System.out.println("ENTERED CHECK CLIENT EXIST INFO REQUIRED => " + prenom + nom + date);
		for (Client cl : clList)
		{
			//System.out.println("CLIENT CHECKED : " + cl.getNom() + " " + cl.getPrenom());
			if (cl.getPrenom().equals(prenom) && cl.getNom().equals(nom) && cl.getDatenaissance().equals(date))
			{
				//System.out.println("CLIENT EQUALED : " + cl.getNom() + " " + cl.getPrenom());
				return cl;
			}
		}
		return null;
	}

	public static Client checkClientExistInData(List<Client> clList, Client cl2)
	{
		//System.out.println("ENTERED CHECK CLIENT");
		for (Client cl : clList)
		{
			//System.out.println("CLIENT CHECKED : " + cl2.getNom() + " " + cl2.getPrenom());
			if (cl2.equals(cl))
			{
				//System.out.println("CLIENT EQUALED : " + cl.getNom() + " " + cl.getPrenom());
				return cl;
			}
		}
		return null;
	}

	public static boolean checkAccountType(AccountType acc)
	{
		for (AccountType type : AccountType.values())
		{
			if (acc.equals(type))
				return true;
		}
		return false;
	}

	public static Account AccounTExistForClient(Client cl, AccountType acc)
	{
		for (Account cmpt : cl.getListCount())
		{
			//System.out.println("Account info for recovering : " + cmpt.getClient().getNom() + " " + cmpt.getClient().getPrenom());
			if (acc.equals(cmpt.getType()) && cmpt.getClient().equals(cl))
			{
				//System.out.println("EQUAL " + cmpt.getClient().getNom());
				return cmpt;
			}
		}
		return null;
	}

	public static boolean AmountIsRight(int amount)
	{
		if (amount > 0)
			return true;
		return false;
	}

	public static boolean AccountIsInRed(Account acc, int amount)
	{
		if (acc.getSolde() - amount < 0)
			return true;	
		return false;
	}

	public static Account AccountExist(List<Account> list, Account acc)
	{
		for (Account cmpt : list)
		{
			if (cmpt.equals(acc))			
				return cmpt;
		}
		return null;
	}

	public static boolean AccountTypeIsLinkedToClient(Client cl, AccountType acc)
	{
		for (Account ac : cl.getListCount())
		{
			if (ac.getType().equals(acc))
				return true;
		}
		return false;
	}
	
	public static boolean AccountIsLinkedToClient(Client cl, Account acc)
	{
		for (Account ac : cl.getListCount())
		{
			if (ac.equals(acc))
				return true;
		}
		return false;
	}
	
	/*public static void updateDatabaseClientToAccountList(List<Account> list, Client cl)
	{
		for (Account ac : list)
		{
			if (ac.equals(acc))
		}
	}*/
	
	public static void updateDatabaseAccountToClientList(List<Client> list, Account acc, Client cl)
	{
		System.out.println("ENTERED UPDATE DATABASE");
		Account acTmp = null;
		
		for (Client cl1 : list)
		{
			for (Account ac : cl1.getListCount())
			{
				//System.out.println("Ac => " + ac.getClient().getNom() + " " + ac.getClient().getPrenom() + " " + ac.getType() + " //////  " + cl1.getNom() + "  " + cl1.getPrenom() + "  " + acc.getType());
				//System.out.println("ac type => " + ac.getType() + " acc type => " + acc.getType());
				//System.out.println("cl client : " + cl.getNom() + " " + cl.getPrenom() + "  " + cl.getDatenaissance().toString());
				//System.out.println("ac client : " + ac.getClient().getNom() + " " + ac.getClient().getPrenom() + "  " + ac.getClient().getDatenaissance().toString());
				if (ac.getType().equals(acc.getType()) && ac.getClient().equals(cl))
				{
					System.out.println("SWITCH HAPPENED for " + acc.getClient().getNom() + "  " + acc.getClient().getPrenom());
					acTmp = ac;
				}
			}
		}
		
		if (acTmp != null)
		{
		Database.getInstance().getListAcc().remove(acTmp);
		Database.getInstance().getListAcc().add(acc);
		}
	}
}
