package by.segg3r.expectunit.expectations.strings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ContainExpectationTest {

	@Test
	public void positive() {
		assertTrue(new ContainExpectation("world").match("Hello world"));
	}

	@Test
	public void negative() {
		assertFalse(new ContainExpectation("world").match("Hello words"));
	}

}
