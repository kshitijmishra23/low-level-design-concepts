package oops.designPatterns.decorator.visualComponents.decorators;

import oops.designPatterns.decorator.visualComponents.VisualComponent;

public abstract class VisualComponentDecorator extends VisualComponent {
    public VisualComponent visualComponent;

    VisualComponentDecorator(VisualComponent visualComponent){
        this.visualComponent = visualComponent;
    }
}
