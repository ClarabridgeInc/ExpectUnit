package by.segg3r.expectunit.expectations.basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class EqualExpectationTest {

	@Test
	public void positive() {
		Object obj = new Object();
		EqualExpectation<Object> equals = new EqualExpectation<Object>(obj);
		assertTrue(equals.match(obj));
	}
	
	@Test
	public void negative() {
		Object obj = new Object();
		Object obj2 = new Object();
		EqualExpectation<Object> equals = new EqualExpectation<Object>(obj2);
		assertFalse(equals.match(obj));
	}
	
}
