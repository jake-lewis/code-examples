package pizzas;

import ingredient_factories.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza
{
	PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory)
	{
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare()
	{
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		pepperoni = ingredientFactory.createPepperoni();
		veggies = ingredientFactory.createVeggies();
		System.out.println(dough.toString());
		System.out.println(sauce.toString());
		System.out.println(cheese.toString());
		System.out.println(pepperoni.toString());
		System.out.println(veggies.toString());
	}
}
