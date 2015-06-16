package by.segg3r.expectunit.expectations.basic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BeExpectationTest {

	@Test
	public void positive() {
		Object obj = new Object();
		BeExpectation<Object> be = new BeExpectation<Object>(obj);
		assertTrue(be.match(obj));
	}

	@Test
	public void negative() {
		Object obj = new Object();
		Object obj2 = new Object();
		BeExpectation<Object> be = new BeExpectation<Object>(obj2);
		assertFalse(be.match(obj));
	}

}
