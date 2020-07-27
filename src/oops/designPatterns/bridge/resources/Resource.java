package oops.designPatterns.bridge.resources;


import java.util.List;

import oops.designPatterns.bridge.Detail;
import oops.designPatterns.bridge.formatters.Formatter;

public abstract class Resource {

	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}
	
	public abstract List<Detail> getDetails();
	
	abstract public String getHeader();
}
