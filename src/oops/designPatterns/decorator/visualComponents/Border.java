package oops.designPatterns.decorator.visualComponents;

public class Border extends VisualComponent {

    private boolean enabled;

    public void draw() {
        System.out.println("Border added");
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
