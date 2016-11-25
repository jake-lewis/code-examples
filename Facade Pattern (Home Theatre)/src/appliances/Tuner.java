package appliances;

public class Tuner
{
	Amplifier amplifier;
	
	@SuppressWarnings("unused")
	private Tuner() {}
	
	public Tuner(Amplifier amplifier)
	{
		this.amplifier = amplifier;
	}
	
	public void on()
	{
		System.out.println("Tuner is on");
	}
	
	public void off()
	{
		System.out.println("Tuner is off");
	}
	
	public void setAm()
	{
		System.out.println("Tuner is in AM mode");
	}
	
	public void setFm()
	{
		System.out.println("Tuner is in FM mode");
	}
	
	public void setFrequency(String frequency)
	{
		System.out.println("Tuner frequency set to " + frequency);
	}
}
