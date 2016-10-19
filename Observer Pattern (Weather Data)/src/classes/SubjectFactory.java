package classes;

import interfaces.Subject;

public class SubjectFactory
{
	
	public final Subject getSubject(Subjects subject)
	{
		return subject.getInstance();
	}
	
	public enum Subjects
	{
		WEATHER_DATA{
			@Override
			public Subject getInstance()
			{
				// TODO Auto-generated method stub
				return new WeatherData();
			}
		}, 
		LOCATION_DATA{
			@Override
			public Subject getInstance()
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		
		public abstract Subject getInstance();
	}
}
