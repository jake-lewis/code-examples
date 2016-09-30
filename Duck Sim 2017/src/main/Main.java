package main;

public class Main {
	
	public static void main(String[] args) {
		
		MallardDuck mallard = new MallardDuck();
		RedheadDuck redhead = new RedheadDuck();
		
		System.out.println("Mallard");
		mallard.display();
		mallard.swim();
		
		System.out.println();
		
		System.out.println("Redhead");
		redhead.display();
		redhead.swim();
	}
}