
package ios.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-16T14:09:27.300+01:00
 * Generated source version: 3.2.0
 */

@WebFault(name = "AccountDoNoExistException", targetNamespace = "http://bankInterface/")
public class AccountDoNoExistException_Exception extends Exception {
    
    private ios.client.AccountDoNoExistException accountDoNoExistException;

    public AccountDoNoExistException_Exception() {
        super();
    }
    
    public AccountDoNoExistException_Exception(String message) {
        super(message);
    }
    
    public AccountDoNoExistException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountDoNoExistException_Exception(String message, ios.client.AccountDoNoExistException accountDoNoExistException) {
        super(message);
        this.accountDoNoExistException = accountDoNoExistException;
    }

    public AccountDoNoExistException_Exception(String message, ios.client.AccountDoNoExistException accountDoNoExistException, Throwable cause) {
        super(message, cause);
        this.accountDoNoExistException = accountDoNoExistException;
    }

    public ios.client.AccountDoNoExistException getFaultInfo() {
        return this.accountDoNoExistException;
    }
}
