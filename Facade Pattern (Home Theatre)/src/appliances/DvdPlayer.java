package appliances;

public class DvdPlayer
{
	Amplifier amplifier;
	
	@SuppressWarnings("unused")
	private DvdPlayer() {}
	
	public DvdPlayer(Amplifier amplifier)
	{
		this.amplifier = amplifier;
	}
	
	public void on()
	{
		System.out.println("Dvd player is on");
	}
	
	public void off()
	{
		System.out.println("Dvd player is off");
	}
	
	public void eject()
	{
		System.out.println("Disk ejected");
	}
	
	public void pause()
	{
		System.out.println("Dvd paused");
	}
	
	public void play()
	{
		System.out.println("Dvd playing");
	}
	
	public void setSurroundAudio()
	{
		System.out.println("Dvd player in surround sound mode");
	}
	
	public void setTwoChannelAudio()
	{
		System.out.println("Dvd player is in two channel audio mode");
	}
	
	public void stop()
	{
		System.out.println("Dvd stopped");
	}
}
