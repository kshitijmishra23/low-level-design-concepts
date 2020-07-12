package oops.designPatterns.decorator.visualComponents;

public class BorderedVisualComponent extends DecoratedVisualComponent {

	protected Border border;

	public BorderedVisualComponent(VisualComponent visualComponent) {
		super(visualComponent);
		this.border = new Border();
	}

	public Border getBorder() {
		return border;
	}

	public void setBorder(Border border) {
		this.border = border;
	}

	@Override
	public void draw() {
		visualComponent.draw();
		border.draw();
	}
}
