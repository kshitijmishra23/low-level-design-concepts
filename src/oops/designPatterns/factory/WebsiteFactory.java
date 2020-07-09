package oops.designPatterns.factory;

import oops.designPatterns.factory.websites.Blog;
import oops.designPatterns.factory.websites.Shop;
import oops.designPatterns.factory.websites.Website;

public class WebsiteFactory {
  public static Website getWebsite(WebsiteType type) {
    switch (type) {
      case BLOG:
        return new Blog();
      case SHOP:
        return new Shop();
      default:
        return null;
    }
  }
}
