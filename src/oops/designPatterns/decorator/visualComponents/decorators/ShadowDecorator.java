package oops.designPatterns.decorator.visualComponents.decorators;


import oops.designPatterns.decorator.visualComponents.VisualComponent;

public class ButtonDecorator extends VisualComponentDecorator {

    public ButtonDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    @Override
    public void draw() {
        System.out.println("Added button.");
    }
}
