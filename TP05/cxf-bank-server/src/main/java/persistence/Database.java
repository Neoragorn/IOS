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
		listAcc.clear();
		ListClient.clear();
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
	
	public  String displayDatabase()
	{
		String information = "";
		information = information + "Displaying database information\nAccount information\n";
		for (Account acc : listAcc)
		{
			information = information +" Account Client : " + acc.getClient().getPrenom() + "  solde : " + acc.getSolde() + " // type => " + acc.getType() + "\n";
		}
		
		information = information + "--------------------------------------------------\nClient Information\n";
		for (Client cl : ListClient)
		{
			information = information + "Client : " + cl.getPrenom() + "\n";
			for (Account acc : cl.getListCount())
			{
				information = information + "account of client : " + acc.getType() + "\n";
			}
		}
		
		information = information + "Ending database information\n";
		information = information + "--------------------------------------------------\n";
		return information;
	}
}
