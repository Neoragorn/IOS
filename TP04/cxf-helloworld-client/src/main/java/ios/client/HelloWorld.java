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
 * 2017-10-25T15:30:43.734+02:00
 * Generated source version: 3.2.0
 * 
 */
@WebService(targetNamespace = "http://server.ios/", name = "HelloWorld")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorld {

    @WebMethod
    @RequestWrapper(localName = "sayHi", targetNamespace = "http://server.ios/", className = "ios.client.SayHi")
    @ResponseWrapper(localName = "sayHiResponse", targetNamespace = "http://server.ios/", className = "ios.client.SayHiResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHi(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
