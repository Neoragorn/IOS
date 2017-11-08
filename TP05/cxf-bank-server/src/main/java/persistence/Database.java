package persistence;

import java.util.ArrayList;
import java.util.List;

import Model.Account;
import Model.Client;

public class Database {

	private static Database instance = new Database();

	private List<Account> listAcc = new ArrayList<Account>();
	private List<Client> ListClient = new ArrayList<Client>();
	
	public Database() {

	}
	
	
	public static Database getInstance()
	{	return instance;
	}


	public List<Account> getListAcc() {
		return listAcc;
	}


	public void setListAcc(List<Account> listAcc) {
		this.listAcc = listAcc;
	}


	public List<Client> getListClient() {
		return ListClient;
	}


	public void setListClient(List<Client> listClient) {
		ListClient = listClient;
	}


	public static void setInstance(Database instance) {
		Database.instance = instance;
	}
	
	public void displayDatabase()
	{
		System.out.println("Displaying database information\nAccount information");
		for (Account acc : listAcc)
		{
			System.out.println(" Account Client : " + acc.getClient().getPrenom() + "  solde : " + acc.getSolde() + " // type => " + acc.getType());
		}
		
		System.out.println("--------------------------------------------------\nClient Information");
		for (Client cl : ListClient)
		{
			System.out.println("Client : " + cl.getPrenom());
			for (Account acc : cl.getListCount())
			{
				System.out.println("account of client : " + acc.getType());
			}
		}
		
		System.out.println("Ending database information");
		System.out.println("--------------------------------------------------");
	}
}
