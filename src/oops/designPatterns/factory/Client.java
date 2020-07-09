package oops.designPatterns.factory;

import oops.designPatterns.factory.websites.Website;

public class Client {

  public static void main(String[] args) {
    Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
    Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
    System.out.println("shop = " + shop);
    System.out.println("blog = " + blog);
  }
}
