package pizzas;

import ingredients.Cheese;
import ingredients.Clams;
import ingredients.Dough;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.Vegetable;

public abstract class Pizza
{
	String name;
	Dough dough;
	Sauce sauce;
	Vegetable veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;
	
	public abstract void prepare();
	
	public void bake()
	{
		System.out.println("Bake for 25 mins at 350");
	}
	
	public void cut()
	{
		System.out.println("Cutting the pizza in diagonal strips");
	}
	
	public void box()
	{
		System.out.println("Place pizza official PizzaStore box");
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "Pizza";
	}
}
