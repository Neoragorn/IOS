package servletnaked;

import java.io.IOException;

import toolnaked.Request;

public interface Servlet {

	public void doGet(Request r) throws IOException;
	
	public void doPost(Request request) throws IOException;
	
}
