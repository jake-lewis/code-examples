package behaviours;

import interfaces.SoundBehaviour;

public class Squeak implements SoundBehaviour {

	@Override
	public void makeNoise() {
		System.out.println("Squeak");
	}
}
