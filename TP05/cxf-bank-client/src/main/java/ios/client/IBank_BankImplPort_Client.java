
package ios.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-09T16:29:56.321+01:00
 * Generated source version: 3.2.0
 * 
 */
public final class IBank_BankImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://server.bank.ios/", "BankImplService");

    private IBank_BankImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = BankImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        BankImplService ss = new BankImplService(wsdlURL, SERVICE_NAME);
        IBank port = ss.getBankImplPort();  
        
        {
        System.out.println("Invoking createAccount...");
        ios.client.Client _createAccount_client = null;
        ios.client.AccountType _createAccount_typecompte = null;
        try {
            ios.client.Account _createAccount__return = port.createAccount(_createAccount_client, _createAccount_typecompte);
            System.out.println("createAccount.result=" + _createAccount__return);

        } catch (TypeOfAccountDoNotExistException_Exception e) { 
            System.out.println("Expected exception: TypeOfAccountDoNotExistException has occurred.");
            System.out.println(e.toString());
        } catch (ClientDoNotExistException_Exception e) { 
            System.out.println("Expected exception: ClientDoNotExistException has occurred.");
            System.out.println(e.toString());
        } catch (TypeOfAccountAlreadyExistForClientException_Exception e) { 
            System.out.println("Expected exception: TypeOfAccountAlreadyExistForClientException has occurred.");
            System.out.println(e.toString());
        } catch (ClientAlreadyExistException_Exception e) { 
            System.out.println("Expected exception: ClientAlreadyExistException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking addMoney...");
        ios.client.Account _addMoney_compte = null;
        int _addMoney_amount = 0;
        try {
            int _addMoney__return = port.addMoney(_addMoney_compte, _addMoney_amount);
            System.out.println("addMoney.result=" + _addMoney__return);

        } catch (SoldeIsNotCorrectException_Exception e) { 
            System.out.println("Expected exception: SoldeIsNotCorrectException has occurred.");
            System.out.println(e.toString());
        } catch (AccountDoNoExistException_Exception e) { 
            System.out.println("Expected exception: AccountDoNoExistException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking virementBetweenAcc...");
        ios.client.Client _virementBetweenAcc_client = null;
        ios.client.Account _virementBetweenAcc_compte1 = null;
        ios.client.Account _virementBetweenAcc_compte2 = null;
        int _virementBetweenAcc_amount = 0;
        try {
            port.virementBetweenAcc(_virementBetweenAcc_client, _virementBetweenAcc_compte1, _virementBetweenAcc_compte2, _virementBetweenAcc_amount);

        } catch (AccountInRedException_Exception e) { 
            System.out.println("Expected exception: AccountInRedException has occurred.");
            System.out.println(e.toString());
        } catch (SoldeIsNotCorrectException_Exception e) { 
            System.out.println("Expected exception: SoldeIsNotCorrectException has occurred.");
            System.out.println(e.toString());
        } catch (AccountNotLinkedToTheClientException_Exception e) { 
            System.out.println("Expected exception: AccountNotLinkedToTheClientException has occurred.");
            System.out.println(e.toString());
        } catch (ClientDoNotExistException_Exception e) { 
            System.out.println("Expected exception: ClientDoNotExistException has occurred.");
            System.out.println(e.toString());
        } catch (AccountDoNoExistException_Exception e) { 
            System.out.println("Expected exception: AccountDoNoExistException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createClient...");
        java.lang.String _createClient_prenom = "";
        java.lang.String _createClient_nom = "";
        javax.xml.datatype.XMLGregorianCalendar _createClient_date = null;
        try {
            ios.client.Client _createClient__return = port.createClient(_createClient_prenom, _createClient_nom, _createClient_date);
            System.out.println("createClient.result=" + _createClient__return);

        } catch (ClientAlreadyExistException_Exception e) { 
            System.out.println("Expected exception: ClientAlreadyExistException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking eraseClient...");
        ios.client.Client _eraseClient_client = null;
        try {
            port.eraseClient(_eraseClient_client);

        } catch (ClientStillHasAnAccountException_Exception e) { 
            System.out.println("Expected exception: ClientStillHasAnAccountException has occurred.");
            System.out.println(e.toString());
        } catch (ClientDoNotExistException_Exception e) { 
            System.out.println("Expected exception: ClientDoNotExistException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking virementInternAcc...");
        ios.client.Client _virementInternAcc_client = null;
        ios.client.AccountType _virementInternAcc_typecompte1 = null;
        ios.client.AccountType _virementInternAcc_typecompte2 = null;
        int _virementInternAcc_amount = 0;
        try {
            port.virementInternAcc(_virementInternAcc_client, _virementInternAcc_typecompte1, _virementInternAcc_typecompte2, _virementInternAcc_amount);

        } catch (AccountInRedException_Exception e) { 
            System.out.println("Expected exception: AccountInRedException has occurred.");
            System.out.println(e.toString());
        } catch (SoldeIsNotCorrectException_Exception e) { 
            System.out.println("Expected exception: SoldeIsNotCorrectException has occurred.");
            System.out.println(e.toString());
        } catch (AccountNotLinkedToTheClientException_Exception e) { 
            System.out.println("Expected exception: AccountNotLinkedToTheClientException has occurred.");
            System.out.println(e.toString());
        } catch (ClientDoNotExistException_Exception e) { 
            System.out.println("Expected exception: ClientDoNotExistException has occurred.");
            System.out.println(e.toString());
        } catch (AccountDoNoExistException_Exception e) { 
            System.out.println("Expected exception: AccountDoNoExistException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking removeMoney...");
        ios.client.Account _removeMoney_compte = null;
        int _removeMoney_amount = 0;
        try {
            int _removeMoney__return = port.removeMoney(_removeMoney_compte, _removeMoney_amount);
            System.out.println("removeMoney.result=" + _removeMoney__return);

        } catch (AccountInRedException_Exception e) { 
            System.out.println("Expected exception: AccountInRedException has occurred.");
            System.out.println(e.toString());
        } catch (SoldeIsNotCorrectException_Exception e) { 
            System.out.println("Expected exception: SoldeIsNotCorrectException has occurred.");
            System.out.println(e.toString());
        } catch (AccountDoNoExistException_Exception e) { 
            System.out.println("Expected exception: AccountDoNoExistException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking closeAccount...");
        ios.client.Account _closeAccount_compte = null;
        try {
            int _closeAccount__return = port.closeAccount(_closeAccount_compte);
            System.out.println("closeAccount.result=" + _closeAccount__return);

        } catch (AccountDoNoExistException_Exception e) { 
            System.out.println("Expected exception: AccountDoNoExistException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking displayDatabase...");
        port.displayDatabase();


        }
        {
        System.out.println("Invoking recoverClient...");
        java.lang.String _recoverClient_prenom = "";
        java.lang.String _recoverClient_nom = "";
        javax.xml.datatype.XMLGregorianCalendar _recoverClient_date = null;
        try {
            ios.client.Client _recoverClient__return = port.recoverClient(_recoverClient_prenom, _recoverClient_nom, _recoverClient_date);
            System.out.println("recoverClient.result=" + _recoverClient__return);

        } catch (ClientDoNotExistException_Exception e) { 
            System.out.println("Expected exception: ClientDoNotExistException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking displaySolde...");
        ios.client.Account _displaySolde_compte = null;
        try {
            int _displaySolde__return = port.displaySolde(_displaySolde_compte);
            System.out.println("displaySolde.result=" + _displaySolde__return);

        } catch (AccountDoNoExistException_Exception e) { 
            System.out.println("Expected exception: AccountDoNoExistException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking recoverAccount...");
        ios.client.Client _recoverAccount_client = null;
        ios.client.AccountType _recoverAccount_typecompte = null;
        try {
            ios.client.Account _recoverAccount__return = port.recoverAccount(_recoverAccount_client, _recoverAccount_typecompte);
            System.out.println("recoverAccount.result=" + _recoverAccount__return);

        } catch (TypeOfAccountDoNotExistException_Exception e) { 
            System.out.println("Expected exception: TypeOfAccountDoNotExistException has occurred.");
            System.out.println(e.toString());
        } catch (ClientDoNotExistException_Exception e) { 
            System.out.println("Expected exception: ClientDoNotExistException has occurred.");
            System.out.println(e.toString());
        } catch (AccountDoNoExistException_Exception e) { 
            System.out.println("Expected exception: AccountDoNoExistException has occurred.");
            System.out.println(e.toString());
        } catch (ClientAlreadyExistException_Exception e) { 
            System.out.println("Expected exception: ClientAlreadyExistException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
