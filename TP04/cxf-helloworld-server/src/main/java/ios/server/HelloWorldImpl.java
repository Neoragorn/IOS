
package ios.server;

import javax.jws.WebService;

@WebService(endpointInterface = "ios.server.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

