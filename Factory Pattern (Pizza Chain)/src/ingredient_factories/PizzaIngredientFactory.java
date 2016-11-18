package ingredient_factories;

import ingredients.Cheese;
import ingredients.Clams;
import ingredients.Dough;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.Vegetable;

public interface PizzaIngredientFactory
{
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Vegetable[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
