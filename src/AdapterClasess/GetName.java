package AdapterClasess;

public class GetName implements GetQuery {
	
	private String query;
	
	public GetName() {
		this.query = "https://mydomain.com/name";
	}

	
	public String getRequest() {
		return this.query;
	}

}
