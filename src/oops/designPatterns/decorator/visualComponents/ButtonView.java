package oops.designPatterns.decorator.visualComponents;

public class ButtonView extends VisualComponent{
    private String content;
    public ButtonView(String content){
        this.content=content;
    }
    @Override
    public void draw(){
        System.out.println("Button is drawn with: "+this.content);
    }
    public String getContent(){
        return this.content;
    }
    public void setContent(String content){
        this.content=content;
    }

}
