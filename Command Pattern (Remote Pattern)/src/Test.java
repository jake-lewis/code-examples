import commands.GarageCloseDoorCommand;
import commands.GarageOpenDoorCommand;
import commands.LightOffCommand;
import commands.LightOnCommand;
import invoker.RemoteControl;
import recievers.GarageDoor;
import recievers.Light;

public class Test
{

	public static void main(String[] args)
	{
		RemoteControl remote = new RemoteControl();
		GarageDoor garageDoor = new GarageDoor();
		GarageOpenDoorCommand openDoorCommand = new GarageOpenDoorCommand(garageDoor);
		GarageCloseDoorCommand closeDoorCommand = new GarageCloseDoorCommand(garageDoor);
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		remote.assignFunction(closeDoorCommand, openDoorCommand);
		remote.pressOnButton(1);
		remote.pressOffButton(1);
		
		remote.assignFunction(lightOffCommand, lightOnCommand);
		remote.pressOnButton(2);
		remote.pressOffButton(2);
		
		System.out.println();
		
//		remote.undo();
//		remote.undo();
//		remote.undo();
//		remote.undo();
		remote.undoAll();
	}
}