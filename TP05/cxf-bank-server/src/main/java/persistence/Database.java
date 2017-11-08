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
}
