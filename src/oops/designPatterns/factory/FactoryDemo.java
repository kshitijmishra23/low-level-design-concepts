package oops.designPatterns.factory;

import oops.designPatterns.factory.websites.Blog;
import oops.designPatterns.factory.websites.Website;

public class FactoryDemo {

	public static void main(String[] args) {
		Blog site = (Blog) WebsiteFactory.getWebsite(WebsiteType.BLOG);
		
		System.out.println(site.getPages());
		
		//site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		
		System.out.println(site.getPages());
	}

}
