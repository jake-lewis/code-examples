package condiments;

import abstractClasses.Beverage;
import abstractClasses.CondimentDecorator;

public class Whip extends CondimentDecorator
{
	
	Beverage beverage;
	
	public Whip(Beverage beverageIn)
	{
		this.beverage = beverageIn;
	}

	public String getDescription()
	{
		return this.beverage.getDescription() + ", Whip";
	}
	
	@Override
	public int cost()
	{
		return 10 + this.beverage.cost();
	}

}
