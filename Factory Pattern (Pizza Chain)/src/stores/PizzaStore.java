package stores;

import pizzas.Pizza;

public abstract class PizzaStore
{
	public abstract Pizza orderPizza(String pizzaType);
}
