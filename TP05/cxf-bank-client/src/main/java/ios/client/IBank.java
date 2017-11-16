package ios.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-16T14:09:27.325+01:00
 * Generated source version: 3.2.0
 * 
 */
@WebService(targetNamespace = "http://bankInterface/", name = "IBank")
@XmlSeeAlso({ObjectFactory.class})
public interface IBank {

    @WebMethod
    @RequestWrapper(localName = "createAccount", targetNamespace = "http://bankInterface/", className = "ios.client.CreateAccount")
    @ResponseWrapper(localName = "createAccountResponse", targetNamespace = "http://bankInterface/", className = "ios.client.CreateAccountResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ios.client.Account createAccount(
        @WebParam(name = "client", targetNamespace = "")
        ios.client.Client client,
        @WebParam(name = "typecompte", targetNamespace = "")
        ios.client.AccountType typecompte
    ) throws TypeOfAccountDoNotExistException_Exception, ClientDoNotExistException_Exception, TypeOfAccountAlreadyExistForClientException_Exception, ClientAlreadyExistException_Exception;

    @WebMethod
    @RequestWrapper(localName = "addMoney", targetNamespace = "http://bankInterface/", className = "ios.client.AddMoney")
    @ResponseWrapper(localName = "addMoneyResponse", targetNamespace = "http://bankInterface/", className = "ios.client.AddMoneyResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int addMoney(
        @WebParam(name = "compte", targetNamespace = "")
        ios.client.Account compte,
        @WebParam(name = "amount", targetNamespace = "")
        int amount
    ) throws SoldeIsNotCorrectException_Exception, AccountDoNoExistException_Exception;

    @WebMethod
    @RequestWrapper(localName = "emptyDatabase", targetNamespace = "http://bankInterface/", className = "ios.client.EmptyDatabase")
    @ResponseWrapper(localName = "emptyDatabaseResponse", targetNamespace = "http://bankInterface/", className = "ios.client.EmptyDatabaseResponse")
    public void emptyDatabase();

    @WebMethod
    @RequestWrapper(localName = "virementBetweenAcc", targetNamespace = "http://bankInterface/", className = "ios.client.VirementBetweenAcc")
    @ResponseWrapper(localName = "virementBetweenAccResponse", targetNamespace = "http://bankInterface/", className = "ios.client.VirementBetweenAccResponse")
    public void virementBetweenAcc(
        @WebParam(name = "client1", targetNamespace = "")
        ios.client.Client client1,
        @WebParam(name = "compte1", targetNamespace = "")
        ios.client.Account compte1,
        @WebParam(name = "client2", targetNamespace = "")
        ios.client.Client client2,
        @WebParam(name = "compte2", targetNamespace = "")
        ios.client.Account compte2,
        @WebParam(name = "amount", targetNamespace = "")
        int amount
    ) throws AccountInRedException_Exception, SoldeIsNotCorrectException_Exception, AccountNotLinkedToTheClientException_Exception, ClientDoNotExistException_Exception, AccountDoNoExistException_Exception;

    @WebMethod
    @RequestWrapper(localName = "createClient", targetNamespace = "http://bankInterface/", className = "ios.client.CreateClient")
    @ResponseWrapper(localName = "createClientResponse", targetNamespace = "http://bankInterface/", className = "ios.client.CreateClientResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ios.client.Client createClient(
        @WebParam(name = "prenom", targetNamespace = "")
        java.lang.String prenom,
        @WebParam(name = "nom", targetNamespace = "")
        java.lang.String nom,
        @WebParam(name = "date", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar date
    ) throws ClientAlreadyExistException_Exception;

    @WebMethod
    @RequestWrapper(localName = "eraseClient", targetNamespace = "http://bankInterface/", className = "ios.client.EraseClient")
    @ResponseWrapper(localName = "eraseClientResponse", targetNamespace = "http://bankInterface/", className = "ios.client.EraseClientResponse")
    public void eraseClient(
        @WebParam(name = "client", targetNamespace = "")
        ios.client.Client client
    ) throws ClientStillHasAnAccountException_Exception, ClientDoNotExistException_Exception;

    @WebMethod
    @RequestWrapper(localName = "virementInternAcc", targetNamespace = "http://bankInterface/", className = "ios.client.VirementInternAcc")
    @ResponseWrapper(localName = "virementInternAccResponse", targetNamespace = "http://bankInterface/", className = "ios.client.VirementInternAccResponse")
    public void virementInternAcc(
        @WebParam(name = "client", targetNamespace = "")
        ios.client.Client client,
        @WebParam(name = "typecompte1", targetNamespace = "")
        ios.client.AccountType typecompte1,
        @WebParam(name = "typecompte2", targetNamespace = "")
        ios.client.AccountType typecompte2,
        @WebParam(name = "amount", targetNamespace = "")
        int amount
    ) throws AccountInRedException_Exception, SoldeIsNotCorrectException_Exception, AccountNotLinkedToTheClientException_Exception, ClientDoNotExistException_Exception, AccountDoNoExistException_Exception;

    @WebMethod
    @RequestWrapper(localName = "removeMoney", targetNamespace = "http://bankInterface/", className = "ios.client.RemoveMoney")
    @ResponseWrapper(localName = "removeMoneyResponse", targetNamespace = "http://bankInterface/", className = "ios.client.RemoveMoneyResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int removeMoney(
        @WebParam(name = "compte", targetNamespace = "")
        ios.client.Account compte,
        @WebParam(name = "amount", targetNamespace = "")
        int amount
    ) throws AccountInRedException_Exception, SoldeIsNotCorrectException_Exception, AccountDoNoExistException_Exception;

    @WebMethod
    @RequestWrapper(localName = "closeAccount", targetNamespace = "http://bankInterface/", className = "ios.client.CloseAccount")
    @ResponseWrapper(localName = "closeAccountResponse", targetNamespace = "http://bankInterface/", className = "ios.client.CloseAccountResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int closeAccount(
        @WebParam(name = "compte", targetNamespace = "")
        ios.client.Account compte
    ) throws AccountDoNoExistException_Exception;

    @WebMethod
    @RequestWrapper(localName = "displayDatabase", targetNamespace = "http://bankInterface/", className = "ios.client.DisplayDatabase")
    @ResponseWrapper(localName = "displayDatabaseResponse", targetNamespace = "http://bankInterface/", className = "ios.client.DisplayDatabaseResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String displayDatabase();

    @WebMethod
    @RequestWrapper(localName = "recoverClient", targetNamespace = "http://bankInterface/", className = "ios.client.RecoverClient")
    @ResponseWrapper(localName = "recoverClientResponse", targetNamespace = "http://bankInterface/", className = "ios.client.RecoverClientResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ios.client.Client recoverClient(
        @WebParam(name = "prenom", targetNamespace = "")
        java.lang.String prenom,
        @WebParam(name = "nom", targetNamespace = "")
        java.lang.String nom,
        @WebParam(name = "date", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar date
    ) throws ClientDoNotExistException_Exception;

    @WebMethod
    @RequestWrapper(localName = "displaySolde", targetNamespace = "http://bankInterface/", className = "ios.client.DisplaySolde")
    @ResponseWrapper(localName = "displaySoldeResponse", targetNamespace = "http://bankInterface/", className = "ios.client.DisplaySoldeResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int displaySolde(
        @WebParam(name = "compte", targetNamespace = "")
        ios.client.Account compte
    ) throws AccountDoNoExistException_Exception;

    @WebMethod
    @RequestWrapper(localName = "recoverAccount", targetNamespace = "http://bankInterface/", className = "ios.client.RecoverAccount")
    @ResponseWrapper(localName = "recoverAccountResponse", targetNamespace = "http://bankInterface/", className = "ios.client.RecoverAccountResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ios.client.Account recoverAccount(
        @WebParam(name = "client", targetNamespace = "")
        ios.client.Client client,
        @WebParam(name = "typecompte", targetNamespace = "")
        ios.client.AccountType typecompte
    ) throws TypeOfAccountDoNotExistException_Exception, ClientDoNotExistException_Exception, AccountDoNoExistException_Exception, ClientAlreadyExistException_Exception;
}
