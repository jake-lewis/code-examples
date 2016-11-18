package commands;

import interfaces.Command;
import recievers.GarageDoor;

public class GarageOpenDoorCommand implements Command
{
	GarageDoor garageDoor;
	
	public GarageOpenDoorCommand(GarageDoor garageDoor)
	{
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute()
	{
		this.garageDoor.openDoor();
	}

	@Override
	public void undo()
	{
		this.garageDoor.closeDoor();
	}
}