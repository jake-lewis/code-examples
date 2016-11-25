package commands;

import interfaces.Command;
import recievers.Door;

public class DoorOpenCommand implements Command
{
	Door garageDoor;
	
	public DoorOpenCommand(Door garageDoor)
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