package appliances;

public class Amplifier
{
	Tuner tuner;
	DvdPlayer dvdPlayer;
	CdPlayer cdPlayer;
	
//	@SuppressWarnings("unused")
//	private Amplifier() {};
	
//	public Amplifier(Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer)
//	{
//		this.tuner = tuner;
//		this.dvdPlayer = dvdPlayer;
//		this.cdPlayer = cdPlayer;
//	}
	
	public void on()
	{
		System.out.println("Amplifier switched on");
	}
	
	public void off()
	{
		System.out.println("Amplifier switched off");
	}
	
	public void setCd()
	{
		System.out.println("Amplifier is playing from CD");
	}
	
	public void setDvd()
	{
		System.out.println("Amplifier is playing from DVD");
	}
	
	public void setTuner()
	{
		System.out.println("Amplifier is playing from tuner");
	}
	
	public void setStereoSound()
	{
		System.out.println("Amplifier is in stereo mode");
	}
	
	public void setSurroundSound()
	{
		System.out.println("Amplifier is in surround sound mode");
	}
	
	public void setVolume(String volume)
	{
		System.out.println("Amplifier volume has been set to " + volume);
	}
}