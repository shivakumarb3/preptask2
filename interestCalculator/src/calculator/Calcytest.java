package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calcytest {

	@Test
	void testSimpleInterest() {
		//fail("Not yet implemented");
		Calcy c=new Calcy();
		double si=c.simpleIntrest(100.0, 2, 1.0);
		assertEquals(102.0,si);
		
	}
	@Test
	void testCompoundInterest()
	{
		Calcy c=new Calcy();
		double si=c.compoundInterest(100.0, 2, 1.0);
		assertEquals(102.01
				,si);
	}

}
