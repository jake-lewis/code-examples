import pizzas.Pizza;
import stores.PizzaStore;
import stores.StoreFactory;

public class Main
{

	public static void main(String[] args)
	{
		PizzaStore newYorkStore = StoreFactory.getStore("new york");
		PizzaStore chicagoStore = StoreFactory.getStore("chicago");
		
		Pizza nyCheese = newYorkStore.orderPizza("cheese");
		nyCheese.prepare();
		nyCheese.bake();
		nyCheese.cut();
		nyCheese.box();
		
		System.out.println();
		
		Pizza chicagoCheese = chicagoStore.orderPizza("cheese");
		chicagoCheese.prepare();
		chicagoCheese.bake();
		chicagoCheese.cut();
		chicagoCheese.box();
	}
}