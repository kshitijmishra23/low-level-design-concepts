package oops.designPatterns.decorator.visualComponents.decorator;

import oops.designPatterns.decorator.visualComponents.VisualComponent;

public class BorderDecorator extends ComponentDecorator{

    public BorderDecorator(VisualComponent component){
        super(component);
    }
    public void draw(){
        this.component.draw();
        System.out.println("Border added");
    }
}
