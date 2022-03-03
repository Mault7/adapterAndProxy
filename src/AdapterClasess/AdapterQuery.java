package AdapterClasess;

public class AdapterQuery implements Query{

	private GetQuery query;
	
	public AdapterQuery(String typeQuery) {
		boolean isQueryName = typeQuery.equalsIgnoreCase("name");
		
		if(isQueryName) {
			this.query = new GetName();
		} else {
			this.query = new GetJob();
		}
		
	}
	public String get() {
		return this.query.getRequest();
	}

}
