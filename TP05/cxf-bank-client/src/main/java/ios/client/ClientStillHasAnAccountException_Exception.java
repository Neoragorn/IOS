
package ios.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-09T16:29:56.444+01:00
 * Generated source version: 3.2.0
 */

@WebFault(name = "ClientStillHasAnAccountException", targetNamespace = "http://bankInterface/")
public class ClientStillHasAnAccountException_Exception extends Exception {
    
    private ios.client.ClientStillHasAnAccountException clientStillHasAnAccountException;

    public ClientStillHasAnAccountException_Exception() {
        super();
    }
    
    public ClientStillHasAnAccountException_Exception(String message) {
        super(message);
    }
    
    public ClientStillHasAnAccountException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ClientStillHasAnAccountException_Exception(String message, ios.client.ClientStillHasAnAccountException clientStillHasAnAccountException) {
        super(message);
        this.clientStillHasAnAccountException = clientStillHasAnAccountException;
    }

    public ClientStillHasAnAccountException_Exception(String message, ios.client.ClientStillHasAnAccountException clientStillHasAnAccountException, Throwable cause) {
        super(message, cause);
        this.clientStillHasAnAccountException = clientStillHasAnAccountException;
    }

    public ios.client.ClientStillHasAnAccountException getFaultInfo() {
        return this.clientStillHasAnAccountException;
    }
}