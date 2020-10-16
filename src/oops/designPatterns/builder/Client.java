package oops.designPatterns.builder;

public class Client {

	public static void main(String[] args) {
		
		final SubWaySandwichOrderV1 sub1 = new SubWaySandwichOrderV1();
		sub1.setBread("Wheat bread");
		sub1.setCondiments("Chilly");
		sub1.setFillings("Chana chatpata");
		sub1.setVeggies("Lettuce");
		
		SubWaySandwichOrderV3 sub3 = new SubWaySandwichOrderV3.Builder()
				.setBread("Multigrain")
				.setFillings("aaloo").build();
		
		
		System.out.println(sub3.getBread());
		System.out.println(sub3.getCondiments());
		System.out.println(sub3.getFillings());
		System.out.println(sub3.getVeggies());
		

	}

}
