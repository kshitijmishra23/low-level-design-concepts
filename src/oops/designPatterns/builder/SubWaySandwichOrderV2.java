package oops.designPatterns.builder;

public class SubWaySandwichOrderV2 {
	private String bread;
    private String condiments;
    private String veggies;
    private String fillings;
    
    public SubWaySandwichOrderV2(String bread) {
    	this.bread = bread;
    }
    
    public SubWaySandwichOrderV2(String bread, String condiments) {
    	this(bread);
    	this.condiments = condiments;
    }
    public SubWaySandwichOrderV2(String bread, String condiments, String veggies) {
    	this(bread,condiments);
    	this.veggies = veggies;
    }
    public SubWaySandwichOrderV2(String bread, String condiments, String veggies, String fillings) {
    	this(bread,condiments,veggies);
    	this.fillings = fillings;
    }
    
    
	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getVeggies() {
		return veggies;
	}

	public String getFillings() {
		return fillings;
	}
	// no public setters

}
