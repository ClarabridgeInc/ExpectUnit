package by.segg3r.expectunit.expectations.strings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MatchExpectationTest {

	@Test
	public void positive() {
		assertTrue(new MatchExpectation("H.*d").match("Hello world"));
	}

	@Test
	public void negative() {
		assertFalse(new MatchExpectation("H.*d").match("Hello words"));
	}

}
