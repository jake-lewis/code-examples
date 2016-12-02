package abstractClasses;

public abstract class CondimentDecorator extends Beverage
{
	String description = "Unknown Condiment";

	public String getDescription()
	{
		return this.description;
	}

	public abstract int cost();

}
