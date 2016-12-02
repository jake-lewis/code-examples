package beverages;

import abstractClasses.UnsizedBeverage;

public class Decaf extends UnsizedBeverage
{

	private int cost;

	public Decaf(int costIn)
	{
		description = "Decaffeineated Coffee";
		this.cost = costIn;
	}

	@Override
	public int cost()
	{
		return this.cost;
	}

}
