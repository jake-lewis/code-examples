package behaviours;

import interfaces.SoundBehaviour;

public class MuteQuack implements SoundBehaviour {

	@Override
	public void makeNoise() {
		System.out.println("<<Silence>>");
	}

}
