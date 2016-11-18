package commands;

import interfaces.Command;
import recievers.GarageDoor;

public class GarageCloseDoorCommand implements Command
{
	GarageDoor garageDoor;
	
	public GarageCloseDoorCommand(GarageDoor garageDoor)
	{
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute()
	{
		this.garageDoor.closeDoor();
	}

	@Override
	public void undo()
	{
		this.garageDoor.openDoor();
	}

}