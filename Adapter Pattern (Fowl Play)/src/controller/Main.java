package controller;

import adapters.TurkeyAdapter;
import ducks.AbstractDuck;
import ducks.MallardDuck;
import ducks.ModelDuck;
import ducks.RedheadDuck;
import turkeys.WildTurkey;

/**
 * Main class for strategy pattern project.
 * 
 * @author jsjlewis96
 */
public class Main
{
	/**
	 * Main method for strategy pattern.
	 * 
	 * @param args
	 *            cmd line arguments
	 */
	public static void main(final String[] args)
	{

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
		
		System.out.println();
		
		WildTurkey turkey = new WildTurkey();
		AbstractDuck turkeyAdapter = new TurkeyAdapter(turkey);
		turkeyAdapter.makeNoise();
		turkeyAdapter.fly();
		turkeyAdapter.display();
	}
}