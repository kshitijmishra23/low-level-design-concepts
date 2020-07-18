package oops.designPatterns.decorator.visualComponents.decorators;

import oops.designPatterns.decorator.visualComponents.VisualComponent;

public abstract class VisualComponentDecorator extends VisualComponent{
	VisualComponent component;
	
	public VisualComponentDecorator(VisualComponent component) {
		this.component = component;
	}
}
