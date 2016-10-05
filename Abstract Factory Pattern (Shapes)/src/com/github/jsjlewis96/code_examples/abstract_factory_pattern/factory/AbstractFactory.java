package com.github.jsjlewis96.code_examples.abstract_factory_pattern.factory;

import com.github.jsjlewis96.code_examples.abstract_factory_pattern.colours.Colour;
import com.github.jsjlewis96.code_examples.abstract_factory_pattern.shapes.Shape;

/**
 * Abstract factory class.
 * @author jsjlewis96
 *
 */
public abstract class AbstractFactory
{
	/**
	 * Factory method that gets a colour object.
	 * @param colour The colour to get
	 * @return The colour
	 */
	public abstract Colour getColour(String colour);
	
	/**
	 * Factory method that gets a shape object.
	 * @param shape The shape to get
	 * @return The shape object
	 */
	public abstract Shape getShape(String shape);
}
