package pizzas;

import ingredient_factories.PizzaIngredientFactory;

public class ClamPizza extends Pizza
{
	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory)
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
		clams = ingredientFactory.createClam();
		System.out.println(dough.toString());
		System.out.println(sauce.toString());
		System.out.println(cheese.toString());
		System.out.println(clams.toString());
	}

}
