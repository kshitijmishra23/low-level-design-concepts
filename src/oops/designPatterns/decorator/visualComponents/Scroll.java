package oops.designPatterns.decorator.visualComponents;

public class Scroll extends VisualComponentDecorator {
  VisualComponent visualComponent;

  public Scroll(VisualComponent visualComponent) {
    this.visualComponent = visualComponent;
  }

  public void draw() {
    visualComponent.draw();
    System.out.println("Added scroll");
  }
}
