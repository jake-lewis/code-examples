package commands;

import interfaces.Command;
import recievers.Door;

public class DoorCloseCommand implements Command
{
	Door garageDoor;
	
	public DoorCloseCommand(Door garageDoor)
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
