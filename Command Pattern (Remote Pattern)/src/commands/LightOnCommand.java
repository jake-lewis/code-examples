package commands;

import interfaces.Command;
import recievers.Light;

public class LightOnCommand implements Command
{
	Light light;
	
	public LightOnCommand(Light light)
	{
		this.light = light;
	}
	
	@Override
	public void execute()
	{
		this.light.lightOn();
	}

	@Override
	public void undo()
	{
		this.light.lightOff();
	}

}
