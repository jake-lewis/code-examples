package beverages;

import abstractClasses.UnsizedBeverage;

public class HouseBlend extends UnsizedBeverage
{

	private int cost;
	
	public HouseBlend(int costIn)
	{
		description = "House Blend";
		this.cost = costIn;
	}

	@Override
	public int cost()
	{
		return this.cost;
	}

}
