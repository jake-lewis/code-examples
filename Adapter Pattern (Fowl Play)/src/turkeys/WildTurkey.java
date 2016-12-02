package turkeys;

import interfaces.Turkey;

public class WildTurkey implements Turkey
{

	@Override
	public void gobble()
	{
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly()
	{
		System.out.println("I'm flying a short distance");
	}
	
	public void swim()
	{
		System.out.println("I can't swim gobble gobble glub...");
	}

}
