package Proxy;

public class RealPostman implements Postman {


	public String makeRequest(String query) {
		
		return "Processing query: " + query;
	}

}
