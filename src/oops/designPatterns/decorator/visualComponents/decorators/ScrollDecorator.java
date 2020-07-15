package oops.designPatterns.decorator.visualComponents.decorators;

import oops.designPatterns.decorator.visualComponents.VisualComponent;

public class ScrollDecorator extends VisualComponentDecorator {
    public ScrollDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    @Override
    public void draw() {
        this.visualComponent.draw();
        System.out.println("Added scroll.");
    }
}
