
package ios.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-09T16:29:56.387+01:00
 * Generated source version: 3.2.0
 */

@WebFault(name = "TypeOfAccountDoNotExistException", targetNamespace = "http://bankInterface/")
public class TypeOfAccountDoNotExistException_Exception extends Exception {
    
    private ios.client.TypeOfAccountDoNotExistException typeOfAccountDoNotExistException;

    public TypeOfAccountDoNotExistException_Exception() {
        super();
    }
    
    public TypeOfAccountDoNotExistException_Exception(String message) {
        super(message);
    }
    
    public TypeOfAccountDoNotExistException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public TypeOfAccountDoNotExistException_Exception(String message, ios.client.TypeOfAccountDoNotExistException typeOfAccountDoNotExistException) {
        super(message);
        this.typeOfAccountDoNotExistException = typeOfAccountDoNotExistException;
    }

    public TypeOfAccountDoNotExistException_Exception(String message, ios.client.TypeOfAccountDoNotExistException typeOfAccountDoNotExistException, Throwable cause) {
        super(message, cause);
        this.typeOfAccountDoNotExistException = typeOfAccountDoNotExistException;
    }

    public ios.client.TypeOfAccountDoNotExistException getFaultInfo() {
        return this.typeOfAccountDoNotExistException;
    }
}