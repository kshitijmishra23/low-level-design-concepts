package oops.designPatterns.decorator;

import oops.designPatterns.decorator.visualComponents.TextView;
import oops.designPatterns.decorator.visualComponents.VisualComponent;
import oops.designPatterns.decorator.visualComponents.decorators.BorderDecorator;
import oops.designPatterns.decorator.visualComponents.decorators.ScrollDecorator;

public class Client {

	public static void main(String[] args) {

		//Draw a textBox with Border and Scroll feature here
		VisualComponent textBox = new TextView("This is a text-box.");
		textBox = new BorderDecorator(textBox);
		textBox = new ScrollDecorator(textBox);

		textBox.draw();

	}

}
