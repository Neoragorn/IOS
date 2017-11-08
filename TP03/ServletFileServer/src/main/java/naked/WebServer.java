package naked;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

import toolnaked.Request;
import toolnaked.SequentialScheduler;

/** Listens to a socket and enters an infinite loop to handle incoming requests. */
public class WebServer implements Runnable {
	private SequentialScheduler s = new SequentialScheduler();
	private RequestAnalyzer rh = new RequestAnalyzer();
	private ServerSocket sock;
	private Socket sock2;
	private boolean cont = true;

	// functional aspect
	public  void run() {
		new Thread(new Runnable() {
			public void run() {
				ServerSocket ss = null;
				try {
					ss = new ServerSocket(8084);
					sock = ss;
					System.err.println("Comanche HTTP Server ready on port 8082.");
					while (cont) {
						try  {
							final Socket socket;
							socket = ss.accept();
							sock2 = socket;
							s.schedule(new Runnable() {
								public void run() {
									Request r;
									try {
										r = new Request(socket);									
										rh.handleRequest(r);
										if (socket != null)
											socket.close();
									} catch (Exception e) {
										try {
											if (socket != null)
												socket.close();
										} catch (IOException er) {
											throw new RuntimeException("this should never happen");

										}
										e.printStackTrace();
										//Nothing else, the server must keep on working
									}
								}
							});
						}
						catch (SocketException e)
						{
							if (cont)	
							{
								System.out.println("Server error : " + e);
							}
						}						
					}
				} catch (IOException e) {
					sock2 = null;
					e.printStackTrace();

					throw new RuntimeException(e);
				} finally {
					try {
						if(ss != null) {
							ss.close();
						}
					} catch (IOException ioe) {
						ss = null;
						throw new RuntimeException("this should never happen");
					}
				}
			}
		}).start();
	}

	public  void stop() throws IOException
	{	
		this.cont = false;
		if (this.sock != null)
			this.sock.close();
		if (this.sock2 != null)
			this.sock2.close();
	}

	public SequentialScheduler getS() {
		return s;
	}

	public void setS(SequentialScheduler s) {
		this.s = s;
	}

	public RequestAnalyzer getRh() {
		return rh;
	}

	public void setRh(RequestAnalyzer rh) {
		this.rh = rh;
	}


}
