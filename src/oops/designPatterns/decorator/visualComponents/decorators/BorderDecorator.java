package oops.designPatterns.decorator.visualComponents.decorators;

import oops.designPatterns.decorator.visualComponents.VisualComponent;

public class BorderDecorator extends VisualComponentDecorator{

	public BorderDecorator(VisualComponent component) {
		super(component);
	}

	@Override
	public void draw() {
		this.component.draw();
		System.out.println("Border Added");
		
	}

}
