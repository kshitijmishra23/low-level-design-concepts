package oops.designPatterns.decorator;

import oops.designPatterns.decorator.beverages.Beverage;
import oops.designPatterns.decorator.beverages.Cappuccino;
import oops.designPatterns.decorator.beverages.decorators.ChocolateDecorator;
import oops.designPatterns.decorator.visualComponents.TextView;
import oops.designPatterns.decorator.visualComponents.VisualComponent;
import oops.designPatterns.decorator.visualComponents.decorators.BorderDecorator;
import oops.designPatterns.decorator.visualComponents.decorators.ScrollDecorator;

public class Client {

	public static void main(String[] args) {
		/*
		VisualComponent textBox = new TextView("This is the text of my text-box");
		VisualComponent textBoxWithBorder = new BorderDecorator(textBox);
		VisualComponent textBoxWithScroll = new ScrollDecorator(textBoxWithBorder);
		
		
		textBoxWithScroll.draw();
		
		*/
		
		Beverage coffee = new Cappuccino();
		System.out.println(coffee.cost());
		
		Beverage coffeeWithCoholate = new ChocolateDecorator(new ChocolateDecorator(coffee));
		System.out.println(coffeeWithCoholate.cost());
		


	}

}
