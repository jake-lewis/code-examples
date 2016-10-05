package com.github.jsjlewis96.code_examples.abstract_factory_pattern.factory;

/**
 * Factory producer class.
 * @author jsjlewis96
 *
 */
public final class FactoryProducer
{
	/**
	 * Constructor.
	 */
	private FactoryProducer()
	{
		//Nothing to do here
	}
	
	/**
	 * Gets a factory object.
	 * @param factory The factory to get
	 * @return The factory
	 */
	public static AbstractFactory getFactory(final String factory)
	{
		if (factory.equalsIgnoreCase("SHAPE"))
		{
			return new ShapeFactory();
		}
		else if (factory.equalsIgnoreCase("COLOUR"))
		{
			return new ColourFactory();
		}

		return null;
	}
}
