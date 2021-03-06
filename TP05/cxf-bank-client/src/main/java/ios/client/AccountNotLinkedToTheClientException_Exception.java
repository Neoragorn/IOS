
package ios.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-16T14:09:27.312+01:00
 * Generated source version: 3.2.0
 */

@WebFault(name = "AccountNotLinkedToTheClientException", targetNamespace = "http://bankInterface/")
public class AccountNotLinkedToTheClientException_Exception extends Exception {
    
    private ios.client.AccountNotLinkedToTheClientException accountNotLinkedToTheClientException;

    public AccountNotLinkedToTheClientException_Exception() {
        super();
    }
    
    public AccountNotLinkedToTheClientException_Exception(String message) {
        super(message);
    }
    
    public AccountNotLinkedToTheClientException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountNotLinkedToTheClientException_Exception(String message, ios.client.AccountNotLinkedToTheClientException accountNotLinkedToTheClientException) {
        super(message);
        this.accountNotLinkedToTheClientException = accountNotLinkedToTheClientException;
    }

    public AccountNotLinkedToTheClientException_Exception(String message, ios.client.AccountNotLinkedToTheClientException accountNotLinkedToTheClientException, Throwable cause) {
        super(message, cause);
        this.accountNotLinkedToTheClientException = accountNotLinkedToTheClientException;
    }

    public ios.client.AccountNotLinkedToTheClientException getFaultInfo() {
        return this.accountNotLinkedToTheClientException;
    }
}
