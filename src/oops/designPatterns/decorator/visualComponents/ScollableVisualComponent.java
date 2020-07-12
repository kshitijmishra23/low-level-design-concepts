package oops.designPatterns.decorator.visualComponents;

public class ScollableVisualComponent extends DecoratedVisualComponent {

	public ScollableVisualComponent(VisualComponent visualComponent) {
		super(visualComponent);
	}

	@Override
	public void draw() {
		visualComponent.draw();
		System.out.println("Scrollbar added");
	}
}
