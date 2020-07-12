package oops.designPatterns.decorator;

import oops.designPatterns.decorator.visualComponents.BorderedVisualComponent;
import oops.designPatterns.decorator.visualComponents.ScollableVisualComponent;
import oops.designPatterns.decorator.visualComponents.TextView;
import oops.designPatterns.decorator.visualComponents.VisualComponent;

public class Client {

	public static void main(String[] args) {
		
		//Draw a textBox with Border and Scroll feature here
		VisualComponent textView = new TextView("some text view");
		textView = new BorderedVisualComponent(textView);
		textView = new ScollableVisualComponent(textView);
		textView.draw();
	}

}
