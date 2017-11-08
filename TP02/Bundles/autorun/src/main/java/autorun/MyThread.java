package autorun;

import org.osgi.framework.ServiceReference;

public class MyThread extends Thread implements Runnable
{
	private Runnable serv;
	
	public MyThread(Runnable s)
	{
		this.serv = s;
	}
	
	public void run()
	{
	 this.serv.run();	
	}
}
