package oops.designPatterns.proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		Browser browser = new Browser();
		browser.sendRequest("www.instagram.com");

	}

}
