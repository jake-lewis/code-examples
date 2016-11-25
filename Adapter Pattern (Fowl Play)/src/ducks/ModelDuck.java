package ducks;

import behaviours.FlyNoWings;
import behaviours.MuteQuack;

public class ModelDuck extends AbstractDuck {

	public ModelDuck() {
		
		super();
		
		this.display();
		this.setQuackBehaviour(new MuteQuack());
		this.setFlyBehaviour(new FlyNoWings());
	}
	
	@Override
	public void display() {
		this.swim();
	}
}
