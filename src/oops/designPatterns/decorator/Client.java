package oops.designPatterns.decorator;

import oops.designPatterns.decorator.visualComponents.Border;
import oops.designPatterns.decorator.visualComponents.Scroll;
import oops.designPatterns.decorator.visualComponents.TextView;
import oops.designPatterns.decorator.visualComponents.VisualComponent;

public class Client {

  public static void main(String[] args) {

    // Draw a textBox with Border and Scroll feature here
    VisualComponent vc = new TextView("Sample Textarea");
    vc = new Border(vc);
    vc = new Scroll(vc);
    vc.draw();
  }
}
