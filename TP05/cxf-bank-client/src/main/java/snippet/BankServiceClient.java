package snippet;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.jaxws.JaxWsClientFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import ios.client.IBank;

public class BankServiceClient {

	private ClientProxyFactoryBean clprox;
	private JaxWsClientFactoryBean ja;
	private Object interfaceBank;
	public BankServiceClient() {
		ja = new JaxWsClientFactoryBean();
		clprox = new ClientProxyFactoryBean(ja);
		
		clprox.setServiceClass(IBank.class);
		clprox.setAddress("http://localhost:8080/cxf-bank-server/cxf-bank-server");
		interfaceBank = clprox.create();
		
		Client client =  ClientProxy.getClient(this.interfaceBank);
		HTTPConduit http = (HTTPConduit) ((Client) client).getConduit();
		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		
		}
	public ClientProxyFactoryBean getClprox() {
		return clprox;
	}
	public void setClprox(ClientProxyFactoryBean clprox) {
		this.clprox = clprox;
	}
	public JaxWsClientFactoryBean getJa() {
		return ja;
	}
	public void setJa(JaxWsClientFactoryBean ja) {
		this.ja = ja;
	}
	public Object getInterfaceBank() {
		return interfaceBank;
	}
	public void setInterfaceBank(Object interfaceBank) {
		this.interfaceBank = interfaceBank;
	}

	
}
