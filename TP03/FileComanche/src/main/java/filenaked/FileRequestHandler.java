package filenaked;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import toolnaked.CanNotCompleteTheRequestException;
import toolnaked.Request;
import toolnaked.ServletFileI;

/** Sends a the content of a file of the file system if the requested URL matches one. */
public class  FileRequestHandler implements ServletFileI {
  public void handleRequest (Request r) throws IOException {
	  
	File f = new File(r.url);
    if (f.exists() && !f.isDirectory()) {
      InputStream is = new FileInputStream(f);
      byte[] data = new byte[is.available()];
      is.read(data);
      is.close();
      r.out.write("HTTP/1.0 200 OK\n\n".getBytes());
      r.out.write(data);
    } else { 
      throw new CanNotCompleteTheRequestException("no such file found : "+f.getAbsolutePath());
    }
  }
}
