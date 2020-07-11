package oops.designPatterns.decorator;

import oops.designPatterns.decorator.visualComponents.TextView;

public class Client {

	public static void main(String[] args) {
		
		//Draw a textBox with Border and Scroll feature here
		TextView textView = new TextView("some text view");
	}

}
