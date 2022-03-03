package AdapterClasess;

public class GetJob implements GetQuery {

	private String query;
	
	public GetJob() {
		this.query = "https://mydomain.com/job";
	}

	
	public String getRequest() {
		return this.query;
	}

}
