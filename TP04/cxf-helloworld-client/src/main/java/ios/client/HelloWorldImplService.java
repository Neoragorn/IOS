package ios.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-10-25T15:30:43.740+02:00
 * Generated source version: 3.2.0
 * 
 */
@WebServiceClient(name = "HelloWorldImplService", 
                  wsdlLocation = "http://localhost:8080/cxf-helloworld-server/HelloWorld?wsdl",
                  targetNamespace = "http://server.ios/") 
public class HelloWorldImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.ios/", "HelloWorldImplService");
    public final static QName HelloWorldImplPort = new QName("http://server.ios/", "HelloWorldImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/cxf-helloworld-server/HelloWorld?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloWorldImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/cxf-helloworld-server/HelloWorld?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWorldImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorldImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HelloWorldImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloWorldImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloWorldImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld getHelloWorldImplPort() {
        return super.getPort(HelloWorldImplPort, HelloWorld.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld getHelloWorldImplPort(WebServiceFeature... features) {
        return super.getPort(HelloWorldImplPort, HelloWorld.class, features);
    }

}
