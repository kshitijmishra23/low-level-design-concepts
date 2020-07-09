package oops.designPatterns.factory.websites;

import oops.designPatterns.factory.pages.CartPage;
import oops.designPatterns.factory.pages.ItemPage;
import oops.designPatterns.factory.pages.SearchPage;

public class Shop extends Website {

  @Override
  public void createWebsite() {
    pages.add(new CartPage());
    pages.add(new ItemPage());
    pages.add(new SearchPage());
  }

  @Override
  public String toString() {
    return "Shop{" + "pages=" + pages + '}';
  }
}
