package calculation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcyTest {

	@Test
	void testAddition() {
		//fail("Not yet implemented");
		Calcy c=new Calcy();
		int res=c.addition(5, 6);
		assertEquals(11,res);
	}
	@Test
	void testSubraction() {
		//fail("Not yet implemented");
		Calcy c=new Calcy();
		int res=c.subraction(5, 6);
		assertEquals(-1,res);
	}
	@Test
	void testMultiplication() {
		//fail("Not yet implemented");
		Calcy c=new Calcy();
		int res=c.multiplication(5, 6);
		assertEquals(30,res);
	}
	@Test
	void testDivision() {
		//fail("Not yet implemented");
		Calcy c=new Calcy();
		int res=c.division(5, 6);
		assertEquals(0,res);
	}
}
