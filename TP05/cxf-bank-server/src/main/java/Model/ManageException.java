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
		for (Client cl : clList)
		{
			if (cl.getPrenom().equals(prenom) && cl.getNom().equals(nom) && cl.getDatenaissance().equals(date))
			{
				return cl;
			}
		}
		return null;
	}

	public static Client checkClientExistInData(List<Client> clList, Client cl2)
	{
		for (Client cl : clList)
		{
			if (cl2.equals(cl))
			{
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
			if (acc.equals(cmpt.getType()) && cmpt.getClient().equals(cl))
			{
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
	
	public static void updateDatabaseAccountToClientList(List<Client> list, Account acc, Client cl)
	{
		Account acTmp = null;
		Client clTmp = null;
		
		for (Client cl1 : list)
		{
			for (Account ac : cl1.getListCount())
			{
				if (ac.getType().equals(acc.getType()) && ac.getClient().equals(cl))
				{
					acTmp = ac;
					clTmp = cl1;
					break;
				}
			}
		}
		
		if (acTmp != null)
		{
			Database.getInstance().getListAcc().remove(acTmp);
			Database.getInstance().getListAcc().add(acc);
					
		}
		if (clTmp != null)
		{
			cl.getListCount().add(acc);
			cl.getListCount().remove(acTmp);
		}
	}
}
