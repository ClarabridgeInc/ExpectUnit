package by.segg3r.expectunit.expectations.booleans;

import static org.junit.Assert.*;

import org.junit.Test;

public class BeTruthyExpectationTest {

	@Test
	public void positive() {
		assertTrue(new BeTruthyExpectation().match(true));
	}
	
	@Test
	public void negative() {
		assertFalse(new BeTruthyExpectation().match(false));
	}

}
