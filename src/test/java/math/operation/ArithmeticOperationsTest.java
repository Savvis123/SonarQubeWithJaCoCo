package math.operation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticOperationsTest {
	
	@Test
	public void testAdd()
	{	
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.add(2, 6);
		Integer expected = 8;
		assertEquals(expected, actual);	
	}

}
