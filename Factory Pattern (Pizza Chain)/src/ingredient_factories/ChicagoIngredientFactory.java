package ingredient_factories;

import ingredients.Aubergine;
import ingredients.BlackOlives;
import ingredients.Cheese;
import ingredients.Clams;
import ingredients.DeepDishDough;
import ingredients.Dough;
import ingredients.ImportedClams;
import ingredients.MozzarellaCheese;
import ingredients.Pepperoni;
import ingredients.PlumTomatoSauce;
import ingredients.Sauce;
import ingredients.Spinach;
import ingredients.Vegetable;

public class ChicagoIngredientFactory implements PizzaIngredientFactory
{

	@Override
	public Dough createDough()
	{
		return new DeepDishDough();
	}

	@Override
	public Sauce createSauce()
	{
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese()
	{
		return new MozzarellaCheese();
	}

	@Override
	public Vegetable[] createVeggies()
	{
		Vegetable[] veggies = {new Aubergine(), new Spinach(), new BlackOlives()};
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
		return new ImportedClams();
	}

}