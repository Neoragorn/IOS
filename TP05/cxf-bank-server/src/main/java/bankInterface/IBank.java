package bankInterface;

import java.util.Calendar;

import javax.jws.WebParam;
import javax.jws.WebService;

import Exception.AccountDoNoExistException;
import Exception.AccountInRedException;
import Exception.AccountNotLinkedToTheClientException;
import Exception.ClientAlreadyExistException;
import Exception.ClientDoNotExistException;
import Exception.ClientStillHasAnAccountException;
import Exception.SoldeIsNotCorrectException;
import Exception.TypeOfAccountAlreadyExistForClientException;
import Exception.TypeOfAccountDoNotExistException;
import Model.Account;
import Model.AccountType;
import Model.Client;

@WebService
public interface IBank {

	public Client createClient(@WebParam(name="prenom") String prenom, @WebParam(name="nom") String nom, @WebParam(name="date") Calendar date) throws ClientAlreadyExistException;
	public Client recoverClient(@WebParam(name="prenom") String prenom, @WebParam(name="nom") String nom, @WebParam(name="date") Calendar date) throws ClientDoNotExistException;
	public Account createAccount(@WebParam(name="client") Client cl, @WebParam(name="typecompte") AccountType acc) throws ClientAlreadyExistException, ClientDoNotExistException, TypeOfAccountDoNotExistException, TypeOfAccountAlreadyExistForClientException;
	public Account recoverAccount(@WebParam(name="client") Client cl, @WebParam(name="typecompte") AccountType acc) throws ClientAlreadyExistException, ClientDoNotExistException, TypeOfAccountDoNotExistException, AccountDoNoExistException;
	public int addMoney(@WebParam(name="compte") Account acc, @WebParam(name="amount") int amount) throws AccountDoNoExistException, SoldeIsNotCorrectException; 
	public int removeMoney(@WebParam(name="compte") Account acc, @WebParam(name="amount") int amount) throws AccountDoNoExistException, SoldeIsNotCorrectException, AccountInRedException;
	public int displaySolde(@WebParam(name="compte") Account acc) throws AccountDoNoExistException;
	public void virementInternAcc(@WebParam(name="client") Client cl1, @WebParam(name="typecompte1") AccountType acc1, @WebParam(name="typecompte2") AccountType acc2,@WebParam(name="amount") int amount) throws AccountNotLinkedToTheClientException, AccountInRedException, SoldeIsNotCorrectException, ClientDoNotExistException, AccountDoNoExistException;
	public void virementBetweenAcc(@WebParam(name="client1") Client cl1, @WebParam(name="compte1") Account acc1, @WebParam(name="client2") Client cl2, @WebParam(name="compte2") Account acc2, @WebParam(name="amount") int amount) throws AccountNotLinkedToTheClientException, AccountInRedException, SoldeIsNotCorrectException, ClientDoNotExistException, AccountDoNoExistException;
	public int closeAccount(@WebParam(name="compte") Account acc) throws AccountDoNoExistException;
	public void eraseClient(@WebParam(name="client") Client cl1) throws ClientStillHasAnAccountException, ClientDoNotExistException;
	public String displayDatabase();
}
