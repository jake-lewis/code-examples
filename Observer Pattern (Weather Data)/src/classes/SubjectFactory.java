package classes;

import interfaces.Subject;

public class SubjectFactory
{

	public final Subject getSubject(SubjectType subject)
	{
		return subject.getInstance();
	}

	public enum SubjectType
	{
		WEATHER_DATA
		{
			@Override
			public Subject getInstance()
			{
				return new WeatherData();
			}
		},
		LOCATION_DATA
		{
			@Override
			public Subject getInstance()
			{
				// TODO
				return null;
			}
		};

		public abstract Subject getInstance();
	}
}
