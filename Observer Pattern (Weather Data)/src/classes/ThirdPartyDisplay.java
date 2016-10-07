package classes;

import interfaces.Displayable;
import interfaces.Observable;
import interfaces.Subject;

public class ThirdPartyDisplay extends AbstractDisplay implements Observable, Displayable
{	
	private Subject[] weatherDataInstance;
	private float temperature;
	private float humidity;
	
	public ThirdPartyDisplay(Subject... weatherData)
	{
		super(weatherData);
		this.weatherDataInstance = weatherData;
	}

	@Override
	public void display()
	{
		System.out.println("Third Party:");
		System.out.println("Temperature is: " + Float.toString(this.temperature) + "C");
		System.out.println("Humidity is: " + Float.toString(this.humidity) + "%");
	}

	@Override
	public void update(float temp, float humid, float press)
	{
		this.temperature = temp;
		this.humidity = humid;
		this.display();
	}

}
