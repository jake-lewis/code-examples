package commands;

import interfaces.Command;
import recievers.Light;

public class LightOffCommand implements Command
{
	Light light;
	
	public LightOffCommand(Light light)
	{
		this.light = light;
	}
	
	@Override
	public void execute()
	{
		this.light.lightOff();
	}

	@Override
	public void undo()
	{
		this.light.lightOn();
	}

}
