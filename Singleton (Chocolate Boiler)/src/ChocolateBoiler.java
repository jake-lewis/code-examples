
public class ChocolateBoiler
{
	private static ChocolateBoiler boilerInstance;
	private boolean empty;
	private boolean boiled;
	
	private ChocolateBoiler()
	{
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance()
	{
		if (boilerInstance == null)
		{
			return new ChocolateBoiler();
		}
		
		return boilerInstance;
	}
	
	public boolean isEmpty() {return empty;}
	
	public boolean isBoiled() {return boiled;}
	
	public void fill()
	{
		if (isEmpty())
		{
			empty = false;
			boiled = false;
		}
	}
	
	public void drain()
	{
		if (!isEmpty() && isBoiled())
		{
			empty = false;
			boiled = false;
		}
	}
	
	public void boil()
	{
		if (!isEmpty() && !isBoiled())
		{
			boiled = true;
		}
	}
}
