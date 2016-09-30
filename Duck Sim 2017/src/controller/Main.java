package controller;

import ducks.AbstractDuck;
import ducks.MallardDuck;
import ducks.ModelDuck;
import ducks.RedheadDuck;

public class Main {
	
	public static void main(String[] args) {
		
		AbstractDuck mallard = new MallardDuck();
		mallard.makeNoise();
		mallard.fly();
		
		System.out.println();
		
		RedheadDuck redhead = new RedheadDuck();
		redhead.makeNoise();
		redhead.fly();
		
		System.out.println();
		
		ModelDuck modelDuck = new ModelDuck();
		modelDuck.makeNoise();
		modelDuck.fly();
	}
}