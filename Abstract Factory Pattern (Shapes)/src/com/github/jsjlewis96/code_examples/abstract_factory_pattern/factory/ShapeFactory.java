package com.github.jsjlewis96.code_examples.abstract_factory_pattern.factory;

import com.github.jsjlewis96.code_examples.abstract_factory_pattern.colours.Colour;
import com.github.jsjlewis96.code_examples.abstract_factory_pattern.shapes.Circle;
import com.github.jsjlewis96.code_examples.abstract_factory_pattern.shapes.Rectangle;
import com.github.jsjlewis96.code_examples.abstract_factory_pattern.shapes.Shape;
import com.github.jsjlewis96.code_examples.abstract_factory_pattern.shapes.Square;

/**
 * Shape factory class.
 * 
 * @author jsjlewis96
 */
public class ShapeFactory extends AbstractFactory
{

	@Override
	public final Shape getShape(final String shape)
	{

		if (shape == null)
		{
			return null;
		}

		if (shape.equalsIgnoreCase("CIRCLE"))
		{
			return new Circle();

		}
		else if (shape.equalsIgnoreCase("RECTANGLE"))
		{
			return new Rectangle();

		}
		else if (shape.equalsIgnoreCase("SQUARE"))
		{
			return new Square();
		}

		return null;
	}

	@Override
	public final Colour getColour(final String colour)
	{
		return null;
	}
}
