package oops.designPatterns.factory.websites;

import oops.designPatterns.factory.pages.CartPage;
import oops.designPatterns.factory.pages.ItemPage;
import oops.designPatterns.factory.pages.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		System.out.println("shop is created");
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
