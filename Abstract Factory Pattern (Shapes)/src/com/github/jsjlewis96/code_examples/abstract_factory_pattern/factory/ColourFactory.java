package com.github.jsjlewis96.code_examples.abstract_factory_pattern.factory;

import com.github.jsjlewis96.code_examples.abstract_factory_pattern.colours.Blue;
import com.github.jsjlewis96.code_examples.abstract_factory_pattern.colours.Colour;
import com.github.jsjlewis96.code_examples.abstract_factory_pattern.colours.Green;
import com.github.jsjlewis96.code_examples.abstract_factory_pattern.colours.Red;
import com.github.jsjlewis96.code_examples.abstract_factory_pattern.shapes.Shape;

/**
 * Colour factory class.
 * @author jsjlewis96
 *
 */
public class ColourFactory extends AbstractFactory
{

	@Override
	public final Shape getShape(final String shapeType)
	{
		return null;
	}

	@Override
	public final Colour getColour(final String colour)
	{

		if (colour == null)
		{
			return null;
		}

		if (colour.equalsIgnoreCase("RED"))
		{
			return new Red();

		}
		else if (colour.equalsIgnoreCase("GREEN"))
		{
			return new Green();

		}
		else if (colour.equalsIgnoreCase("BLUE"))
		{
			return new Blue();
		}

		return null;
	}
}
