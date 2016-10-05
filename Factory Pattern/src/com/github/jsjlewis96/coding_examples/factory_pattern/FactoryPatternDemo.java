package com.github.jsjlewis96.coding_examples.factory_pattern;

import com.github.jsjlewis96.coding_examples.factory_pattern.factory.ShapeFactory;
import com.github.jsjlewis96.coding_examples.factory_pattern.shapes.Shape;

/**
 * Factory pattern demo class.
 * 
 * @author jsjlewis96
 */
public final class FactoryPatternDemo
{

	/**
	 * Default constructor.
	 */
	private FactoryPatternDemo()
	{
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Main java method.
	 * 
	 * @param args
	 *            cmd line arguments
	 */
	public static void main(final String[] args)
	{
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();

		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
	}

}
