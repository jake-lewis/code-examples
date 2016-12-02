package condiments;

import abstractClasses.Beverage;
import abstractClasses.CondimentDecorator;

public class Mocha extends CondimentDecorator
{

Beverage beverage;
	
	public Mocha(Beverage beverageIn)
	{
		this.beverage = beverageIn;
	}

	public String getDescription()
	{
		return this.beverage.getDescription() + ", Mocha";
	}
	
	@Override
	public int cost()
	{
		return 20 + this.beverage.cost();
	}

}
