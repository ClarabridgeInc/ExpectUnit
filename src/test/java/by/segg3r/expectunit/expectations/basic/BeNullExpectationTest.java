package by.segg3r.expectunit.expectations.basic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BeNullExpectationTest {

	@Test
	public void positive() {
		Object obj = null;
		BeNullExpectation<Object> beNull = new BeNullExpectation<Object>();
		assertTrue(beNull.match(obj));
	}

	@Test
	public void negative() {
		Object obj = new Object();
		BeNullExpectation<Object> beNull = new BeNullExpectation<Object>();
		assertFalse(beNull.match(obj));
	}

}
