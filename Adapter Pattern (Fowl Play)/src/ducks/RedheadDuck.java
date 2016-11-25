package ducks;

import behaviours.FlyWithWings;
import behaviours.Squeak;

public class RedheadDuck extends AbstractDuck {
	
	public RedheadDuck() {
		super();
		
		this.display();
		this.setQuackBehaviour(new Squeak());
		this.setFlyBehaviour(new FlyWithWings());
	}

	@Override
	public void display() {
		this.swim();
	}
}
