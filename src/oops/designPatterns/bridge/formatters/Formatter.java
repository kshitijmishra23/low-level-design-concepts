package oops.designPatterns.bridge.formatters;


import java.util.List;

import oops.designPatterns.bridge.Detail;
import oops.designPatterns.bridge.resources.Resource;

public abstract class Formatter {
	Resource resource;
	
	public Formatter(Resource resource) {
		this.resource = resource;
	}
	public abstract String format(String header, List<Detail> details);
	public abstract String render();
}
