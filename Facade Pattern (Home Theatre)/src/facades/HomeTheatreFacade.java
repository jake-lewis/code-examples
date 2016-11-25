package facades;

import appliances.Amplifier;
import appliances.CdPlayer;
import appliances.DvdPlayer;
import appliances.PopcornMachine;
import appliances.Projector;
import appliances.Screen;
import appliances.TheatreLights;
import appliances.Tuner;

public class HomeTheatreFacade
{
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvdPlayer;
	CdPlayer cdPlayer;
	Projector projector;
	TheatreLights lights;
	Screen screen;
	PopcornMachine popper;
	
	public HomeTheatreFacade()
	{
		lights = new TheatreLights();
		screen = new Screen();
		popper = new PopcornMachine();
		amp = new Amplifier();
		tuner = new Tuner(amp);
		dvdPlayer = new DvdPlayer(amp);
		cdPlayer = new CdPlayer(amp);
		projector = new Projector(dvdPlayer);
		
		lights.on();
	}
	
	public void watchMovie(String movie)
	{
		System.out.println("Get ready to watch " + movie);
		popper.on();
		popper.pop();
		lights.dim();
		screen.lower();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd();
		amp.setSurroundSound();
		amp.setVolume("5");
		dvdPlayer.on();
		dvdPlayer.play();
	}
	
	public void endMovie()
	{
		System.out.println("Shutting movie theatre down...");
		dvdPlayer.stop();
		dvdPlayer.eject();
		dvdPlayer.off();
		amp.off();
		projector.off();
		screen.raise();
		lights.on();
		popper.off();
	}
}
