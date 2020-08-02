package oops.designPatterns.proxy;

public class Browser {

	public void sendRequest(String site){
		String response = this.getInternetProvider().getResource(site);
		this.loadResponse(response);
	}

	private void loadResponse(String response){
		System.out.println(response);
	}
	

	private Internet getInternetProvider(){
		return new NetworkConfig().getInternet();
	}
}