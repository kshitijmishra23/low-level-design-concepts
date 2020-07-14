package oops.designPatterns.decorator.visualComponents;

public class Button extends VisualComponent {

    String content;

    public Button(String content) {
        this.content = content;
    }

    @Override
    public void draw() {
        System.out.println("Text View Drawn with the content: " + content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
