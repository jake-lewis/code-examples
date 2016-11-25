package appliances;

public class CdPlayer
{
	Amplifier amplifier;
	
	@SuppressWarnings("unused")
	private CdPlayer() {}
	
	public CdPlayer(Amplifier amplifier)
	{
		this.amplifier = amplifier;
	}
	
	public void on()
	{
		System.out.println("CD player is on");
	}
	
	public void off()
	{
		System.out.println("CD player is off");
	}
	
	public void eject()
	{
		System.out.println("CD ejected");
	}
	
	public void pause()
	{
		System.out.println("CD paused");
	}
	
	public void play()
	{
		System.out.println("CD playing");
	}
	
	public void stop()
	{
		System.out.println("CD stopped");
	}
}
