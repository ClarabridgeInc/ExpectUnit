package by.segg3r.expectunit.expectations;

import by.segg3r.expectunit.Expectation;
import org.testng.annotations.Test;

import static by.segg3r.expectunit.Expect.*;
import static by.segg3r.expectunit.Expectations.*;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AndExpectationTest {
	
	private Expectation<Object> positive = new Expectation<Object>() {
		public boolean match(Object object) {
			return true;
		}

		@Override
		public String getMatchErrorMessage() {
			return "";
		}
	};
	
	private Expectation<Object> negative = new Expectation<Object>() {
		public boolean match(Object object) {
			return false;
		}

		@Override
		public String getMatchErrorMessage() {
			return "";
		}
	};
	
	@Test
	public void bothPositive() {
		Expectation<Object> and = new AndExpectation<Object>(positive, positive);
		assertTrue(and.match(new Object()));
	}
	
	@Test
	public void bothNegative() {
		Expectation<Object> and = new AndExpectation<Object>(negative, negative);
		assertFalse(and.match(new Object()));
	}
	
	@Test
	public void onePositiveOneNegative() {
		Expectation<Object> and = new AndExpectation<Object>(positive, negative);
		assertFalse(and.match(new Object()));
	}

	@Test(
			expectedExceptions = AssertionError.class,
			expectedExceptionsMessageRegExp = "Expected false to be falsy and be truthy")
	public void andAssertionErrorMessage() {
		expect(false).to(beFalsy().and(beTruthy()));
	}

}
