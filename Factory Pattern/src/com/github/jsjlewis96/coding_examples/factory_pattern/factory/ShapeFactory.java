package com.github.jsjlewis96.coding_examples.factory_pattern.factory;

import com.github.jsjlewis96.coding_examples.factory_pattern.shapes.Circle;
import com.github.jsjlewis96.coding_examples.factory_pattern.shapes.Rectangle;
import com.github.jsjlewis96.coding_examples.factory_pattern.shapes.Shape;
import com.github.jsjlewis96.coding_examples.factory_pattern.shapes.Square;

/**
 * Shape factory class.
 * 
 * @author jsjlewis96
 */
public class ShapeFactory
{
	/**
	 * Gets object of type shape.
	 * 
	 * @param shapeType
	 *            The type of shape object to get.
	 * @return The shape object
	 */
	public final Shape getShape(final String shapeType)
	{
		if (shapeType == null)
		{
			return null;
		}
		else if (shapeType.equalsIgnoreCase("CIRCLE"))
		{
			return new Circle();
		}
		else if (shapeType.equalsIgnoreCase("RECTANGLE"))
		{
			return new Rectangle();
		}
		else if (shapeType.equalsIgnoreCase("SQUARE"))
		{
			return new Square();
		}

		return null;
	}
}
