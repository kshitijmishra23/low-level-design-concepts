package oops.designPatterns.decorator.beverages.decorators;

import oops.designPatterns.decorator.beverages.Beverage;

public abstract class BeverageDecorator extends Beverage{
	
	Beverage beverage;
	
	public BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
}
