package by.segg3r.expectunit.expectations;

import static org.junit.Assert.*;

import org.junit.Test;

import by.segg3r.expectunit.Expectation;

public class OrExpectationTest {
	
	private Expectation<Object> positive = new Expectation<Object>() {
		public boolean match(Object object) {
			return true;
		}
	};
	
	private Expectation<Object> negative = new Expectation<Object>() {
		public boolean match(Object object) {
			return false;
		}
	};
	
	@Test
	public void bothPositive() {
		Expectation<Object> or = new OrExpectation<Object>(positive, positive);
		assertTrue(or.match(new Object()));
	}
	
	@Test
	public void bothNegative() {
		Expectation<Object> or = new OrExpectation<Object>(negative, negative);
		assertFalse(or.match(new Object()));
	}
	
	@Test
	public void onePositiveOneNegative() {
		Expectation<Object> or = new OrExpectation<Object>(positive, negative);
		assertTrue(or.match(new Object()));
	}
	
}
