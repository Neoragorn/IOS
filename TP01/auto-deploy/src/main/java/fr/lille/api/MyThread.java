package fr.lille.api;

import java.net.MalformedURLException;

import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

public class MyThread extends Thread {

	private Checker checker = new Checker(
			"/home/m2miage/casier/Documents/IOS/TP01/auto-deploy/src/main/resources/fr/lille/ios/TestChecking/");
	private volatile boolean running = true;
	private BundleContext bc;

	public MyThread(BundleContext context) {
		this.bc = context;
	}

	@Override
	public void run() {
		System.out.println("thread started");
		while (running) {
			try {
				try {
					this.checker.start(bc);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			} catch (BundleException e1) {
				e1.printStackTrace();
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void stopThread() {
		this.running = false;
	}
}
