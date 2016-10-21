package sizes;

import abstractClasses.SizeDecorator;
import abstractClasses.UnsizedBeverage;

public class Small extends SizeDecorator
{
	UnsizedBeverage beverage;
	
	public Small(UnsizedBeverage beverageIn)
	{
		this.beverage = beverageIn;
	}

	public String getDescription()
	{
		return "Small, " + this.beverage.getDescription();
	}

	@Override
	public int cost()
	{
		return (int) (0.75 * (double) this.beverage.cost());
	}
}
