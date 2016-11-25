package commands;

import interfaces.Command;
import recievers.Blind;

public class BlindOpenCommand implements Command
{
	Blind blinds;
	
	public BlindOpenCommand(Blind blinds)
	{
		this.blinds = blinds;
	}
	
	@Override
	public void execute()
	{
		this.blinds.blindUp();
	}

	@Override
	public void undo()
	{
		this.blinds.blindDown();
	}

}
