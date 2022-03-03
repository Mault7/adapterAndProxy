
public class ProxyImage {

	private RealImage realImage;
	private String token;
	private String query;
	private static String validator = "123";

	public ProxyImage(String query) {
		this.query = query;
		this.token = validator;
	}

	public void makeRequest(String token) {
		if (this.token == token) {

			realImage = new RealImage(this.query);
		}

		else {
			System.out.println("error Credentials");
		}
	}
}
