package oops.designPatterns.bridge.formatters;


import java.util.List;

import oops.designPatterns.bridge.Detail;
import oops.designPatterns.bridge.resources.Resource;

public class PrintFormatter extends Formatter {

	public PrintFormatter(Resource resource) {
		super(resource);
	}

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder builder = new StringBuilder();
		builder.append(header);
		builder.append("\n");

		for (Detail detail : details) {
			builder.append(detail.getLabel());
			builder.append(":");
			builder.append(detail.getValue());
			builder.append("\n");
		}

		return builder.toString();
	}

	@Override
	public String render() {
		return this.format(this.resource.getHeader(), this.resource.getDetails());
	}
}
