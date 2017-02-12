package by.segg3r.expectunit.expectations;

import by.segg3r.expectunit.Expectation;
import org.testng.annotations.Test;

import static by.segg3r.expectunit.Expect.expect;
import static by.segg3r.expectunit.Expectations.beFalsy;
import static by.segg3r.expectunit.Expectations.beTruthy;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class OrExpectationTest {
	
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

	@Test(
			expectedExceptions = AssertionError.class,
			expectedExceptionsMessageRegExp = "Expected false to be truthy or be truthy")
	public void andAssertionErrorMessage() {
		expect(false).to(beTruthy().or(beTruthy()));
	}

}
