package oops.designPatterns.decorator.visualComponents.decorators;

import oops.designPatterns.decorator.visualComponents.VisualComponent;

public class BorderDecorator extends VisualComponentDecorator {
    public BorderDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    @Override
    public void draw() {
        this.visualComponent.draw();
        System.out.println("Added border.");
    }
}
