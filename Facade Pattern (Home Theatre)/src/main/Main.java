package main;

import facades.HomeTheatreFacade;

public class Main
{

	public static void main(String[] args)
	{
		HomeTheatreFacade facade = new HomeTheatreFacade();
		facade.watchMovie("Inception");
		System.out.println();
		facade.endMovie();
	}

}
