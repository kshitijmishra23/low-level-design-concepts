package oops.designPatterns.factory.websites;

import oops.designPatterns.factory.WebstieFactory;

public class WebsiteClient {
    public static void main(String[] args) {
        Website shop = WebstieFactory.getWebsite(WebsiteType.SHOP);
        Website blog = WebstieFactory.getWebsite(WebsiteType.BLOG);

    }
}
