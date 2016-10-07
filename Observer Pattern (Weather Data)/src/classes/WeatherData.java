package classes;

import java.util.ArrayList;

import interfaces.Observable;
import interfaces.Subject;

public class WeatherData implements Subject
{
	private ArrayList<Observable> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData()
	{
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observable observer)
	{
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observable observer)
	{
		int i = observers.indexOf(observer);
		
		if (i >= 0)
		{
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers()
	{
		for (Observable observer: observers)
		{
			observer.update(this.temperature, this.humidity, this.pressure);
		}
	}

	/**
	 * @return the temperature
	 */
	public float getTemperature()
	{
		return this.temperature;
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity()
	{
		return this.humidity;
	}

	/**
	 * @return the pressure
	 */
	public float getPressure()
	{
		return this.pressure;
	}
	
	public void measurementsChanged()
	{
		this.notifyObservers();
	}
	
	public void setMeasurments(float temp, float humid, float press)
	{
		this.temperature = temp;
		this.humidity = humid;
		this.pressure = press;
		this.measurementsChanged();
	}

	public void close()
	{
		for (Observable observer: observers)
		{
			this.removeObserver(observer);
		}
	}
}
