package classes;

public class WeatherStation
{

	public static void main(String[] args)
	{
		WeatherData weatherData = new WeatherData();
		WeatherData secondData = new WeatherData();
		
		@SuppressWarnings("unused")
		ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData, secondData);
		
		weatherData.setMeasurments(80, 74, 30.29f);
		secondData.setMeasurments(20, 20, 20);
	}
}
