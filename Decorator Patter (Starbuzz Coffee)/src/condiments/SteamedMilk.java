package condiments;

import abstractClasses.Beverage;
import abstractClasses.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator
{

Beverage beverage;
	
	public SteamedMilk(Beverage beverageIn)
	{
		this.beverage = beverageIn;
	}

	public String getDescription()
	{
		return this.beverage.getDescription() + ", Steamed Milk";
	}
	
	@Override
	public int cost()
	{
		return 10 + this.beverage.cost();
	}

}
