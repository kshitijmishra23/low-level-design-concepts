package oops.designPatterns.builder;

public class SubWaySandwichOrderV3 {
	private String bread;
    private String condiments;
    private String veggies;
    private String fillings;
    
    public SubWaySandwichOrderV3(Builder b) {
    	this.bread = b.bread;
    	this.condiments = b.condiments;
    	this.veggies = b.veggies;
    	this.fillings = b.fillings;
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
	
	public static class Builder{
		private String bread;
	    private String condiments;
	    private String veggies;
	    private String fillings;
	    
	    public Builder setBread(String bread) {
	    	this.bread = bread;
	    	return this;
	    }
	    
	    public Builder setCondiments(String condiments) {
	    	this.condiments = condiments;
	    	return this;
	    }

		public Builder setVeggies(String veggies) {
			this.veggies = veggies;
			return this;
		}

		public Builder setFillings(String fillings) {
			this.fillings = fillings;
			return this;
		}
		public SubWaySandwichOrderV3 build() {
			return new SubWaySandwichOrderV3(this);
		}
	    
	}


}
