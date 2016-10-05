package com.github.jsjlewis96.code_examples.abstract_factory_pattern.colours;

/**
 * Red colour class.
 * @author jsjlewis96
 *
 */
public class Red implements Colour
{

	@Override
	public final void fill()
	{
		System.out.println("Inside Red::fill() method.");
	}
}
