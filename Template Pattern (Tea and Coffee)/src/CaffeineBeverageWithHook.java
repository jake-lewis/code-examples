public abstract class CaffeineBeverageWithHook
{
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	abstract void brew();
	
	abstract void addCondiments();

	void boilWater() {
		//implementation
	}

	void pourInCup() {
		//implementation
	}
	
	boolean customerWantsCondiments() {     //this is a hook because the subclass can override but
		return true;		       //doesn’t have to.
	}
}
