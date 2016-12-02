package ingredient_factories;

import ingredients.Cheese;
import ingredients.Clams;
import ingredients.Dough;
import ingredients.FreshClams;
import ingredients.Garlic;
import ingredients.MarinaraSauce;
import ingredients.Mushroom;
import ingredients.Onion;
import ingredients.Pepperoni;
import ingredients.RedPepper;
import ingredients.ReggianoCheese;
import ingredients.Sauce;
import ingredients.ThinCrustDough;
import ingredients.Vegetable;

public class NYIngredientFactory implements PizzaIngredientFactory
{

	@Override
	public Dough createDough()
	{
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce()
	{
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese()
	{
		return new ReggianoCheese();
	}

	@Override
	public Vegetable[] createVeggies()
	{
		Vegetable[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni()
	{
		return new Pepperoni();
	}

	@Override
	public Clams createClam()
	{
		return new FreshClams();
	}

}
