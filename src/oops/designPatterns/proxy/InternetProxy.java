package oops.designPatterns.proxy;

import java.util.Calendar;

public class InternetProxy implements Internet {

	@Override
	public String getResource(String site) {
		this.logRequest(site);
		if(this.isBlocked(site)){
			return "The company has blocked this site.";
		}
		NetworkConfig networkSettings = new NetworkConfig();
		return networkSettings.getISP().getResource(site);
	}

	private void logRequest(String site){
		System.out.println(Calendar.getInstance().getTime()+" Request for - "+site);
	}
	
	private boolean isBlocked(String site){
		switch (site) {
		case "www.scaler.com":
			return false;
		case "www.stackoverflow.com":
			return false;
		case "www.github.com":
			return false;
		default:
			return true;
		}
	}

}
