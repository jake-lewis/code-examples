package com.github.jsjlewis96.code_examples.abstract_factory_pattern.shapes;

/**
 * Square shape class.
 * 
 * @author jsjlewis96
 */
public class Square implements Shape
{

	@Override
	public final void draw()
	{
		System.out.println("Inside Square::draw() method.");
	}

}
