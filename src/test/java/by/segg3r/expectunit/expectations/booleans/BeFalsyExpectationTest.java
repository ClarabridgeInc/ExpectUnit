package by.segg3r.expectunit.expectations.booleans;

import static org.junit.Assert.*;

import org.junit.Test;

public class BeFalsyExpectationTest {

	@Test
	public void positive() {
		assertTrue(new BeFalsyExpectation().match(false));
	}
	
	@Test
	public void negative() {
		assertFalse(new BeFalsyExpectation().match(true));
	}

}
