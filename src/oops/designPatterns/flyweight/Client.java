package oops.designPatterns.flyweight;

public class Client {

	public static void main(String[] args) {
		
		Integer a = Integer.valueOf(200);
		Integer b = Integer.valueOf(10);
		Integer c = Integer.valueOf(201);
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		a++;
		System.out.println("------------------------");
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		
		/*
		Inventory inventory = new Inventory();
		inventory.takeOrder("TV");
		inventory.takeOrder("Earphone");
		inventory.takeOrder("earphone");
		inventory.takeOrder("EarPhone");
		inventory.takeOrder("book");
		
		inventory.process();
		System.out.println(inventory.report());
		*/

	}

}
