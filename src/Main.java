import AdapterClasess.*;
import Proxy.Postman;
import Proxy.ProxyPostman;

public class Main {

	public static void main(String[] args) {
		
		Query adapterQuery = new AdapterQuery("job");
		String myToken = "123";
		
		//Adapt consult
		String query = adapterQuery.get();
		
		//Create ProxyPostman
		Postman proxyPostman = new ProxyPostman(query);
		//validate ProxyPostman
		String result = proxyPostman.makeRequest(myToken);
		System.out.println(result);
		
	}

}
