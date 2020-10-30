class BorderDecorator extends VisualComponentDecorator{

  BorderDecorator(VisualComponent c){
    super(c);
  }
  
  public void draw(){
    System.out.println("Adding Border to Text");
    this.component.draw();
  }
}
