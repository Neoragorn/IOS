package fr.lille1.ios;

import fr.lille1.ios.api.*;
import fr.lille1.ios.lib.*;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	private ServiceRegistration<?> sAck;

	public void start(BundleContext context) throws Exception {
		Service s = (Service) new Server();
		sAck = context.registerService(Service.class.getName(), s, null);
		System.out.println("Bundle starts...");
	}

	public void stop(BundleContext context) throws Exception {
		sAck.unregister();
		System.out.println("Bundle stops...");
	}

}
