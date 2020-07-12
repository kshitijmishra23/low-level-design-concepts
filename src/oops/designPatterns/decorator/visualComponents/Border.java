package oops.designPatterns.decorator.visualComponents;

public class Border extends VisualComponentDecorator {
    VisualComponent visualComponent;

    public Border(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }

    public void draw() {
        visualComponent.draw();
        System.out.println("Added Border");
    }
}
