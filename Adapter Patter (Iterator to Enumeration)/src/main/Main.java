package main;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import adapters.IteratorEnumeration;

public class Main
{

	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("first", "second", "third");
		Enumeration<String> enumeration = new IteratorEnumeration<>(list.iterator());
		
		while (enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
		}
	};

}
