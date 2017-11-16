
package ios.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-16T14:09:27.294+01:00
 * Generated source version: 3.2.0
 */

@WebFault(name = "SoldeIsNotCorrectException", targetNamespace = "http://bankInterface/")
public class SoldeIsNotCorrectException_Exception extends Exception {
    
    private ios.client.SoldeIsNotCorrectException soldeIsNotCorrectException;

    public SoldeIsNotCorrectException_Exception() {
        super();
    }
    
    public SoldeIsNotCorrectException_Exception(String message) {
        super(message);
    }
    
    public SoldeIsNotCorrectException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public SoldeIsNotCorrectException_Exception(String message, ios.client.SoldeIsNotCorrectException soldeIsNotCorrectException) {
        super(message);
        this.soldeIsNotCorrectException = soldeIsNotCorrectException;
    }

    public SoldeIsNotCorrectException_Exception(String message, ios.client.SoldeIsNotCorrectException soldeIsNotCorrectException, Throwable cause) {
        super(message, cause);
        this.soldeIsNotCorrectException = soldeIsNotCorrectException;
    }

    public ios.client.SoldeIsNotCorrectException getFaultInfo() {
        return this.soldeIsNotCorrectException;
    }
}
