package oops.designPatterns.bridge;


public class Detail {
	private String label;
	private String value;

	public Detail(String label, String value) {
		this.label = label;
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public String getValue() {
		return value;
	}

}