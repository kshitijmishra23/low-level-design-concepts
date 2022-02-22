package oops.designPatterns.decorator.visualComponents.decorator;

import oops.designPatterns.decorator.visualComponents.VisualComponent;

public class ScrollDecorator extends ComponentDecorator{
    public ScrollDecorator(VisualComponent component){
        super(component);
    }
    public void draw(){
        this.component.draw();
        System.out.println("Scroll added");
    }
}
