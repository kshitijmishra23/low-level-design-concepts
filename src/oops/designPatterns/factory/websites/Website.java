package oops.designPatterns.factory.websites;



import java.util.ArrayList;
import java.util.List;

import oops.designPatterns.factory.pages.Page;

public abstract class Website {

	protected List<Page> pages = new ArrayList<>();
	
	public List<Page> getPages() {
		return pages;
	}

	public Website() {
		this.createWebsite();
	}
	
	public abstract void createWebsite();
	
}
