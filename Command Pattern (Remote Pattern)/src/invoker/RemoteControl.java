package invoker;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

import org.apache.commons.collections4.iterators.ReverseListIterator;

import interfaces.Command;
import javafx.util.Pair;

public class RemoteControl
{
	private Map<Integer, Pair<Command, Command>> slots;
	private Stack<Command> actions;
	private Stack<Command> redoActions;
	int nextEmptySlot = 1;
	
	public RemoteControl()
	{
		this.slots = new HashMap<>();
		this.actions = new Stack<>();
		//TODO REDO
		this.redoActions = new Stack<>();
	}
	
	public void assignFunction(Command offCommand, Command onCommand)
	{
			this.slots.put(nextEmptySlot, new Pair<>(offCommand, onCommand));
			nextEmptySlot++;
	}
	
	public void assignFunction(Command offCommand, Command onCommand, int slotNo)
	{
			this.slots.put(slotNo, new Pair<>(offCommand, onCommand));
	}
	
	public void pressOnButton(int slot)
	{
		Command command = this.slots.get(slot).getValue();
		command.execute();
		this.actions.push(command);
	}
	
	public void pressOffButton(int slot)
	{
		Command command = this.slots.get(slot).getKey();
		command.execute();
		this.actions.push(command);
	}
	
	public void undo()
	{
		this.actions.pop().undo();
	}
	
	public void undoAll()
	{
		for (Iterator<Command> action = new ReverseListIterator<>(actions); action.hasNext();)
		{
			action.next().undo();
		}
	}
}
