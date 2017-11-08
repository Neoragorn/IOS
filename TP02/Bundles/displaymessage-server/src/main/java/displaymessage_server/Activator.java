package displaymessage_server;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import itf.DisplayService;
import server.ServerMessage;

public class Activator implements BundleActivator {

	private ServiceRegistration sAck;
	
    public void start(BundleContext context) throws Exception {
    	ServerMessage s = new ServerMessage();
        sAck = (ServiceRegistration) context.registerService(DisplayService.class.getName(), s, null);
        System.out.println("Bundle starts...");
    }

    public void stop(BundleContext context) throws Exception {
        System.out.println("Bundle stops...");
    }

}
