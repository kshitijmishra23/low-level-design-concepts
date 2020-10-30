class ScrollDecorator extends VisualComponentDecorator(){

  ScrollDecorator(VisualComponent c){
    super(c)
  }
  public void draw(){
    System.out.println("Adding Scroll");
    this.component.draw();
  }
}
