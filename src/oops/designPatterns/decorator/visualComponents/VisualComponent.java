package oops.designPatterns.decorator.visualComponents;

public abstract class VisualComponent {

	protected Border border = new Border();

	public Border getBorder() {
		return border;
	}

	public abstract void draw();
}
