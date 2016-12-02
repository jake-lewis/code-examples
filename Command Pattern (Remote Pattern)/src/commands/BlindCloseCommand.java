package commands;

import interfaces.Command;
import recievers.Blind;

public class BlindCloseCommand implements Command
{
	private Blind blinds;
	
	public BlindCloseCommand(Blind blinds)
	{
		this.blinds = blinds;
	}
	
	@Override
	public void execute()
	{
		this.blinds.blindDown();
	}

	@Override
	public void undo()
	{
		this.blinds.blindUp();
	}
}
