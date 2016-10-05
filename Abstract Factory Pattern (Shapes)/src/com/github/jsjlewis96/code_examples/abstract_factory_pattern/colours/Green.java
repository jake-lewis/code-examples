package com.github.jsjlewis96.code_examples.abstract_factory_pattern.colours;

/**
 * Green colour class.
 * 
 * @author jsjlewis96
 */
public class Green implements Colour
{

	@Override
	public final void fill()
	{
		System.out.println("Inside Green::fill() method.");
	}
}
