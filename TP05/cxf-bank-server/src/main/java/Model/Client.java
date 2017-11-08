package Model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Client {

	private String nom;
	private String prenom;
	private Calendar datenaissance;
	private List<Account> listCount = new ArrayList<Account>();

	public Client()
	{
		
	}
	
	public Client(String nom, String prenom, Calendar datenaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Calendar getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Calendar datenaissance) {
		this.datenaissance = datenaissance;
	}
	public List<Account> getListCount() {
		return listCount;
	}
	public void setListCount(List<Account> listCount) {
		this.listCount = listCount;
	}

	public boolean equals(Client cl)
	{
		if (cl.getPrenom().equals(this.prenom) && cl.getNom().equals(this.nom) && cl.getDatenaissance().equals(this.datenaissance))
			return true;
		return false;
	}

	public boolean equalsWithAccount(Client cl)
	{
		if (cl.getPrenom().equals(this.prenom) && cl.getNom().equals(this.nom) && cl.getDatenaissance().equals(this.datenaissance))
			if (this.listCount.equals(cl.getListCount()))		
				return true;
		return false;
	}
	
	public boolean checkTypeAcc(AccountType type)	
	{
		for (Account acc : this.listCount)
		{
			if (acc.getType().equals(type))
				return true;
		}
		return false;
	}
}
