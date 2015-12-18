package base;

import static org.junit.Assert.*;
import org.apache.poi.ss.formula.functions.FinanceLib;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Rate_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	int PV = 300000;
	int FV = 0;
	int rate = (int) 0.04;
	int NmbrOfPay = 360;
	double PMT = FinanceLib.pmt(rate, NmbrOfPay, 0, FV, true);
	assertTrue(PMT == 1432.25);
	
	
	
			
	}

}
