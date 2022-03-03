package Proxy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProxyPostmanTest {

	Postman proxyPostmanl;

	@Test
	void testMakeRequest() {

		String query = "example.com";
		String expectedeValue = "Processing query: " + query;
		String obteniedValue;
		String myToken = "123";

		//When 
		proxyPostmanl = new ProxyPostman(query);
		
		//Then
		obteniedValue = proxyPostmanl.makeRequest(myToken);
		assertEquals(expectedeValue, obteniedValue);

	}

}
