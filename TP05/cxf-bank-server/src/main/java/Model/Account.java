package Model;

public class Account {

		private Client client;
		private AccountType type;
		private int solde;
		
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
		
		
}
