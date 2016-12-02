package stores;

import ingredient_factories.ChicagoIngredientFactory;
import ingredient_factories.PizzaIngredientFactory;
import pizzas.CheesePizza;
import pizzas.ClamPizza;
import pizzas.PepperoniPizza;
import pizzas.Pizza;
import pizzas.VegetarianPizza;

public class ChicagoStore extends PizzaStore
{

	public Pizza orderPizza(String pizzaType)
	{
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();
		
		if (pizzaType.equalsIgnoreCase("cheese"))
		{
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago style cheese pizza");
		}
		else if (pizzaType.equalsIgnoreCase("pepperoni"))
		{
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago style pepperoni pizza");
		}
		else if (pizzaType.equalsIgnoreCase("clam"))
		{
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago style clam pizza");
		}
		else if (pizzaType.equalsIgnoreCase("vegetarian"))
		{
			pizza = new VegetarianPizza(ingredientFactory);
			pizza.setName("Chicago style vegetarian pizza");
		}

		return pizza;
	}

}
