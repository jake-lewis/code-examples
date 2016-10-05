package behaviours;

import interfaces.MovementBehaviour;

/**
 * @author jsjlewis96
 */
public class FlyNoWings implements MovementBehaviour
{

	/**
	 * 
	 */
	public void move()
	{
		System.out.println("I can't fly :'(");
	}
}