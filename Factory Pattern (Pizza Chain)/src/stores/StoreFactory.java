package stores;

public class StoreFactory
{
	public static PizzaStore getStore(String storeType)
	{
		if (storeType.equalsIgnoreCase("new york"))
		{
			return new NewYorkStore();
		}
		else if (storeType.equalsIgnoreCase("chicago"))
		{
			return new ChicagoStore();
		}
		else return null;
	}
}
