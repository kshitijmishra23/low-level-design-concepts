package oops.designPatterns.decorator.visualComponents;

public class Button extends VisualComponent {
    String value;

    public Button(String value){
        this.value = value;
    }

    @Override
    public void draw() {
        System.out.println("This is a button with value : " + value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
