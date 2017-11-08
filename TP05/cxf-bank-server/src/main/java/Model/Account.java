package Model;

public class Account {

	private Client client;
	private AccountType type;
	private int solde;

	public Account()
	{
		
	}
	
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public AccountType getType() {
		return type;
	}
	public void setType(AccountType type) {
		this.type = type;
	}
	public Account(Client client, AccountType type) {
		super();
		this.client = client;
		this.type = type;
		this.solde = 0;
	}

	public boolean equals(Account acc)
	{
		if (client.equals(acc.getClient()) && this.type.equals(acc.getType()) && this.solde == acc.getSolde())
			return true;
		return false;
	}
}
