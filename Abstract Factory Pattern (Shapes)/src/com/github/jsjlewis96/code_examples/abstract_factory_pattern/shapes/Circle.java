package com.github.jsjlewis96.code_examples.abstract_factory_pattern.shapes;

/**
 * Circle class.
 * 
 * @author jsjlewis96
 */
public class Circle implements Shape
{

	@Override
	public final void draw()
	{
		System.out.println("Inside Circle::draw() method.");
	}

}
