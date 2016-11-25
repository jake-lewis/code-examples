package appliances;

public class Projector
{
	DvdPlayer dvdPlayer;
	
	@SuppressWarnings("unused")
	private Projector() {}
	
	public Projector(DvdPlayer dvdPlayer)
	{
		this.dvdPlayer = dvdPlayer;
	}
	
	public void on()
	{
		System.out.println("Projector is on");
	}
	
	public void off()
	{
		System.out.println("Projector is off");
	}
	
	public void tvMode()
	{
		System.out.println("Projector is in TV mode");
	}
	
	public void wideScreenMode()
	{
		System.out.println("Projector is in widescreen mode");
	}
}
