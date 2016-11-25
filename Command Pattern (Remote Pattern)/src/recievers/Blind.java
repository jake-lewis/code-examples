package recievers;

public class Blind
{
	private String location;
	
	public Blind(String location)
	{
		this.location = location;
	}
	
	public void blindUp()
	{
		System.out.println("The " + this.location + " blind is up.");
	}
	
	public void blindDown()
	{
		System.out.println("The " + this.location + " blind is down.");
	}

}
