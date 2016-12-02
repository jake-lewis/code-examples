import commands.BlindCloseCommand;
import commands.BlindOpenCommand;
import commands.DoorCloseCommand;
import commands.DoorOpenCommand;
import commands.LightOffCommand;
import commands.LightOnCommand;
import interfaces.Command;
import invoker.RemoteControl;
import recievers.Door;
import recievers.Light;
import recievers.Blind;

public class Test
{

	public static void main(String[] args)
	{
		RemoteControl remote = new RemoteControl();
		Door garageDoor = new Door("garage");
		Light kitchenLight = new Light("kitchen");
		Blind livingRoomBlind = new Blind("living room");
		
		Command openDoorCommand = new DoorOpenCommand(garageDoor);
		Command closeDoorCommand = new DoorCloseCommand(garageDoor);
		
		Command lightOnCommand = new LightOnCommand(kitchenLight);
		Command lightOffCommand = new LightOffCommand(kitchenLight);
		
		Command blindOpenCommand = new BlindOpenCommand(livingRoomBlind);
		Command blindCloseCommand = new BlindCloseCommand(livingRoomBlind);
		
		System.out.println("--------Doing stuff-------");
		
		remote.assignFunction(closeDoorCommand, openDoorCommand);
		remote.pressOnButton(1);
		remote.pressOffButton(1);
		
		remote.assignFunction(lightOffCommand, lightOnCommand);
		remote.pressOnButton(2);
		remote.pressOffButton(2);
		
		remote.assignFunction(blindCloseCommand, blindOpenCommand);
		remote.pressOnButton(3);
		remote.pressOffButton(3);
		
		System.out.println();
		
		System.out.println("-------Undoing stuff-------");
		
//		remote.undo();
//		remote.undo();
//		remote.undo();
//		remote.undo();
		remote.undoAll();
	}
}