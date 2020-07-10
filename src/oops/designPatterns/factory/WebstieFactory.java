package oops.designPatterns.factory;


import oops.designPatterns.factory.websites.Blog;
import oops.designPatterns.factory.websites.Shop;
import oops.designPatterns.factory.websites.Website;
import oops.designPatterns.factory.websites.WebsiteType;


public class WebstieFactory {


    public static Website getWebsite(WebsiteType websiteType){
        switch (websiteType){
            case BLOG:
                return new Blog();

            case SHOP:
                return new Shop();

            default:
                return null;
        }


    }

}
