package behaviours;

import interfaces.SoundBehaviour;

public class Quack implements SoundBehaviour {

	@Override
	public void makeNoise() {
		System.out.println("Quack!");
	}

}
