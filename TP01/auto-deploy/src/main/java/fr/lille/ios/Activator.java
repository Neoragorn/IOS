package fr.lille.ios;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import fr.lille.api.Checker;
import fr.lille.api.MyThread;

public class Activator implements BundleActivator {

	private MyThread thread;	
	public static BundleContext bc = null; 
	
    public void start(BundleContext context) throws Exception {
    	System.out.println("Bundle begins");
    	this.bc = context;
    	thread = new MyThread(bc);
    	thread.start();
    }

    public void stop(BundleContext context) throws Exception {
    	System.out.println("Bundle stopping");
        thread.stopThread();
    	thread.join();
    }

}
