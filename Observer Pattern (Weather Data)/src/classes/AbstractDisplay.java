package classes;

import java.security.InvalidParameterException;

import interfaces.Displayable;
import interfaces.Observable;
import interfaces.Subject;

public abstract class AbstractDisplay implements Displayable, Observable
{
	
	public AbstractDisplay(Subject... subject)
	{
		if (subject.length < 1)
		{
			throw new InvalidParameterException("Displays must be assigned at least one subject.");
		}
		
		for (Subject sub: subject)
		{
			sub.registerObserver(this);
		}
	}
	
	@Override
	public abstract void display();

}
