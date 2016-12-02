package tests;

import static org.junit.Assert.fail;

import com.github.jsjlewis96.coding_examples.factory_pattern.factory.ShapeFactory;
import com.github.jsjlewis96.coding_examples.factory_pattern.shapes.Circle;
import com.github.jsjlewis96.coding_examples.factory_pattern.shapes.Shape;

public class Test
{

	@org.junit.Test
	public void test()
	{
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("SQUARE");
		boolean test = shape1 instanceof Circle;

		if (!test)
		{
			fail("nope");
		}
	}

}
