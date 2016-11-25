package ducks;

import behaviours.FlyWithWings;
import behaviours.Quack;

public class MallardDuck extends AbstractDuck {
	
	public MallardDuck()
	{
		super();
		
		this.display();
		this.setQuackBehaviour(new Quack());
		this.setFlyBehaviour(new FlyWithWings());
	}

	@Override
	public void display() {
		this.swim();
	}
}
