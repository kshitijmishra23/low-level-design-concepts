package oops.designPatterns.decorator.visualComponents;

public class TextView extends VisualComponent{
	
	String content;
	private boolean borderEnabled;
	
	public TextView(String content, boolean borderEnabled) {
		this.content = content;
		this.borderEnabled = borderEnabled;
		if(borderEnabled)
			border = new Border();
	}

	@Override
	public void draw() {
		System.out.println("Text View Drawn with the content: " + content);
		if(border != null)
			border.draw();
	}
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}
