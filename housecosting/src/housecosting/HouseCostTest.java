package housecosting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseCostTest {

	@Test
	void testCostcalculaltionStandard() {
		HouseCost h=new HouseCost();
		int res=h.costcalculaltion("standard", 10);
		assertEquals(1200*10,res);
		
	}
	@Test
	void testCostcalculationAbove() {
		HouseCost h=new HouseCost();
		int res=h.costcalculaltion("above standard", 10);
		assertEquals(1500*10,res);
		
	}
	@Test
	void testCostcalculaltionHighStandard() {
		HouseCost h=new HouseCost();
		int res=h.costcalculaltion("high standard", 10);
		assertEquals(1800*10,res);
		
	}
	@Test
	void testCostcalculaltionHighStandardAutomated() {
		HouseCost h=new HouseCost();
		int res=h.costcalculaltion("high standard and fully automated", 10);
		assertEquals(2500*10,res);
		
	}

}
