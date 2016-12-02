package test;

import abstractClasses.Beverage;
import abstractClasses.UnsizedBeverage;
import beverages.DarkRoast;
import beverages.Decaf;
import beverages.HouseBlend;
import condiments.Mocha;
import condiments.Soy;
import condiments.SteamedMilk;
import condiments.Whip;
import sizes.Small;

public class Test
{

	public static void main(String[] args)
	{
		Beverage houseBlend = new HouseBlend(89);
		houseBlend = new Small((UnsizedBeverage) houseBlend);
		houseBlend = new SteamedMilk(houseBlend);
		System.out.println(houseBlend.getDescription());
		System.out.println(getCost(houseBlend));

		System.out.println();

		Beverage darkRoast = new DarkRoast(99);
		darkRoast = new Soy(darkRoast);
		darkRoast = new Mocha(darkRoast);
		System.out.println(darkRoast.getDescription());
		System.out.println(getCost(darkRoast));

		System.out.println();

		Beverage decaf = new Decaf(105);
		decaf = new Whip(decaf);
		System.out.println(decaf.getDescription());
		System.out.println(getCost(decaf));
	}

	private static String getCost(Beverage beverage)
	{
		int pennies = beverage.cost() % 100;
		int pounds = (beverage.cost() - pennies) / 100;
		return "This costs £" + pounds + "." + pennies;
	}

}
