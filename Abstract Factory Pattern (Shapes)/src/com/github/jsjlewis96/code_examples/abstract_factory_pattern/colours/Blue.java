package com.github.jsjlewis96.code_examples.abstract_factory_pattern.colours;

/**
 * Blue colour class.
 * 
 * @author jsjlewis96
 */
public class Blue implements Colour
{

	@Override
	public final void fill()
	{
		System.out.println("Inside Blue::fill() method.");
	}
}
