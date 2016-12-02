
public class Main
{

	public static void main(String[] args)
	{
		CaffeineBeverageWithHook coffee = new CoffeeWithHook();
		CaffeineBeverageWithHook tea = new Tea();
		
		//Uses hook, so will ask for condiments
		System.out.println("\nMaking Coffee...");
		coffee.prepareRecipe();
		
		//Doesn't use hook, so assumes condiments are wanted
		System.out.println("\nMaking Tea...");
		tea.prepareRecipe();
	}
}