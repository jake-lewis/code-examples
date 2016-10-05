package com.github.jsjlewis96.code_examples.abstract_factory_pattern;

import com.github.jsjlewis96.code_examples.abstract_factory_pattern.colours.Colour;
import com.github.jsjlewis96.code_examples.abstract_factory_pattern.factory.AbstractFactory;
import com.github.jsjlewis96.code_examples.abstract_factory_pattern.factory.FactoryProducer;
import com.github.jsjlewis96.code_examples.abstract_factory_pattern.shapes.Shape;

/**
 * Abstract factory pattern demo class.
 * 
 * @author jsjlewis96
 */
public final class AbstractFactoryPatternDemo
{
	/**
	 * Default constructor.
	 */
	private AbstractFactoryPatternDemo()
	{
		// Nothing to do here
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 *            cmd line arguments
	 */
	public static void main(final String[] args)
	{
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		AbstractFactory colourFactory = FactoryProducer.getFactory("COLOUR");

		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();

		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();

		Colour colour1 = colourFactory.getColour("RED");
		colour1.fill();

		Colour colour2 = colourFactory.getColour("GREEN");
		colour2.fill();

		Colour colour3 = colourFactory.getColour("BLUE");
		colour3.fill();
	}
}
