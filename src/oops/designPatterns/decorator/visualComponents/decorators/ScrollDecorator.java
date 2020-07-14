package oops.designPatterns.decorator.visualComponents.decorators;

import oops.designPatterns.decorator.visualComponents.VisualComponent;

public class ScrollDecorator extends VisualComponentDecorator {

	public ScrollDecorator(VisualComponent component) {
		super(component);
	}

	@Override
	public void draw() {
		this.component.draw(); 
		System.out.println("Scroll added");
	}

}
