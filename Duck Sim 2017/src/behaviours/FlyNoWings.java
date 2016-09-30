package behaviours;

import interfaces.MovementBehaviour;

public class FlyNoWings implements MovementBehaviour {

	@Override
	public void move() {
		System.out.println("I can't fly :'(");
	}

}
