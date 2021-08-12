package oops.designPatterns.decorator.visualComponents.decorator;

import oops.designPatterns.decorator.visualComponents.VisualComponent;

public abstract class ComponentDecorator extends VisualComponent {
    VisualComponent component;
    public ComponentDecorator(VisualComponent component){
        this.component=component;
    }

}
