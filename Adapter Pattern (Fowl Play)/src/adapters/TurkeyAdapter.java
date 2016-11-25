package adapters;

import ducks.AbstractDuck;
import interfaces.Turkey;

public class TurkeyAdapter extends AbstractDuck
{
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey)
	{
		this.turkey = turkey;
	}
	
	public void fly()
	{
		for (int i = 0; i < 5; i++)
		{
			turkey.fly();
		}
	}

	@Override
	public void makeNoise()
	{
		this.turkey.gobble();
	}

	@Override
	public void display()
	{
		turkey.swim();
	}

}
