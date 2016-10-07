package interfaces;

import interfaces.Observable;

public interface Subject
{
	public void registerObserver(Observable observer);
	public void removeObserver(Observable observer);
	public void notifyObservers();
	public void close();
}
