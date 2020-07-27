package oops.designPatterns.bridge.formatters;


import java.util.List;

import oops.designPatterns.bridge.Detail;
import oops.designPatterns.bridge.resources.Resource;

public class HtmlFormatter extends Formatter {

	public HtmlFormatter(Resource resource) {
		super(resource);
	}

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder builder = new StringBuilder();
		builder.append("<table>");
		builder.append("<th>");
		builder.append("Classification");
		builder.append("</th>");
		builder.append("<th>");
		builder.append(header);
		builder.append("</th>");

		for (Detail detail : details) {
			builder.append("<tr><td>");
			builder.append(detail.getLabel());
			builder.append("</td><td>");
			builder.append(detail.getValue());
			builder.append("</td></tr>");
		}
		builder.append("</table>");

		return builder.toString();
	}

	@Override
	public String render() {
		return this.format(this.resource.getHeader(), this.resource.getDetails());
	}

}
