package condiments;

import abstractClasses.Beverage;
import abstractClasses.CondimentDecorator;

public class Soy extends CondimentDecorator
{

	Beverage beverage;

	public Soy(Beverage beverageIn)
	{
		this.beverage = beverageIn;
	}

	public String getDescription()
	{
		return this.beverage.getDescription() + ", Soy";
	}

	@Override
	public int cost()
	{
		return 15 + this.beverage.cost();
	}

}
