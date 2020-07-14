package oops.designPatterns.decorator.beverages.decorators;

import oops.designPatterns.decorator.beverages.Beverage;

public class ChocolateDecorator extends BeverageDecorator{

	public ChocolateDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public int cost() {
		return this.beverage.cost() + 5;
	}

}
