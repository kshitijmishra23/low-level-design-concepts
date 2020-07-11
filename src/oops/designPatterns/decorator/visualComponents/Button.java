package oops.designPatterns.decorator.visualComponents;

public class Button extends VisualComponent{
	
	String label;
	private boolean borderEnabled;
	
	public Button(String label, boolean borderEnabled) {
		this.label = label;
		this.borderEnabled = borderEnabled;
		if(borderEnabled)
			border = new Border();
	}

	@Override
	public void draw() {
		System.out.println("Button Drawn with the content: " + label);
		if(border != null)
			border.draw();
	}
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	

}
