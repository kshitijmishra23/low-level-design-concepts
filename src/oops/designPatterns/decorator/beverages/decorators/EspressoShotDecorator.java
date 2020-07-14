package oops.designPatterns.decorator.beverages.decorators;

import oops.designPatterns.decorator.beverages.Beverage;

public class EspressoShotDecorator extends BeverageDecorator {

	public EspressoShotDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public int cost() {
		return this.beverage.cost() + 6;
	}
	

}
