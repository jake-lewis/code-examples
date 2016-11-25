package recievers;

public class Door
{
	private String location;
	
	public Door(String location)
	{
		this.location = location;
	}
	
	public void openDoor()
	{
		System.out.println("The " + this.location + " door is opening.");
	}
	
	public void closeDoor()
	{
		System.out.println("The " + this.location + " door is closing.");
	}
}
