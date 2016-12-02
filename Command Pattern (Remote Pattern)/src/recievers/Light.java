package recievers;

public class Light
{
	private String location;
	
	public Light(String location)
	{
		this.location = location;
	}
	
	public void lightOn()
	{
		System.out.println("The " + this.location + " light is on.");
	}
	
	public void lightOff()
	{
		System.out.println("The " + this.location + " light is off.");
	}
}
