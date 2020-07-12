package oops.designPatterns.decorator.visualComponents;

public class Button extends VisualComponent {
	
	String label;
	
	public Button(String label) {
		this.label = label;
	}

	@Override
	public void draw() {
		System.out.println("Button Drawn with the content: " + label);
	}
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
