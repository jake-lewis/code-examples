package beverages;

import abstractClasses.UnsizedBeverage;

public class DarkRoast extends UnsizedBeverage
{

	private int cost;
	
	public DarkRoast(int costIn)
	{
		description = "Dark Roast";
		this.cost = costIn;
	}

	@Override
	public int cost()
	{
		return this.cost;
	}

}
