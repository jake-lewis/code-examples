package stores;

import ingredient_factories.NYIngredientFactory;
import ingredient_factories.PizzaIngredientFactory;
import pizzas.CheesePizza;
import pizzas.ClamPizza;
import pizzas.PepperoniPizza;
import pizzas.Pizza;
import pizzas.VegetarianPizza;

public class NewYorkStore extends PizzaStore
{

	public Pizza orderPizza(String pizzaType)
	{
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYIngredientFactory();
		
		if (pizzaType.equalsIgnoreCase("cheese"))
		{
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York style cheese pizza");
		}
		else if (pizzaType.equalsIgnoreCase("pepperoni"))
		{
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York style pepperoni pizza");
		}
		else if (pizzaType.equalsIgnoreCase("clam"))
		{
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York style clam pizza");
		}
		else if (pizzaType.equalsIgnoreCase("vegetarian"))
		{
			pizza = new VegetarianPizza(ingredientFactory);
			pizza.setName("New York style vegetarian pizza");
		}

		return pizza;
	}
}
