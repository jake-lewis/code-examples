package ducks;

import interfaces.MovementBehaviour;
import interfaces.SoundBehaviour;

public abstract class AbstractDuck {
	
	private MovementBehaviour flyBehaviour;
	private SoundBehaviour noiseBehaviour;
	
	public AbstractDuck() {
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys.");
	}
	
	public abstract void display();
	
	public void makeNoise() {
		noiseBehaviour.makeNoise();
	}
	
	public void fly() {
		flyBehaviour.move();
	}
	
	public void setQuackBehaviour(SoundBehaviour behaviour) {
		this.noiseBehaviour = behaviour;
	}
	
	public void setFlyBehaviour(MovementBehaviour behaviour) {
		this.flyBehaviour = behaviour;
	}
}