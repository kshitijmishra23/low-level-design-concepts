package oops.designPatterns.factory.websites;


import oops.designPatterns.factory.pages.AboutPage;
import oops.designPatterns.factory.pages.CommentPage;
import oops.designPatterns.factory.pages.ContactPage;
import oops.designPatterns.factory.pages.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
