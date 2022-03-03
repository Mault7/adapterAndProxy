
public class RealImage {

	private String query;

	public RealImage(String query) {
		this.query=query;
		makeRequest(query);
	}

	public void makeRequest(String query) {
		System.out.println("Displaying " + query);
	}

}
