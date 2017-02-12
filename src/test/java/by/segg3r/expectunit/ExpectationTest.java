package by.segg3r.expectunit;

import by.segg3r.expectunit.expectations.AndExpectation;
import by.segg3r.expectunit.expectations.OrExpectation;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ExpectationTest {

	@Test
	public void shouldCreateAndExpectation() {
		Expectation<Object> expectation1 = new Expectation<Object>() {
			public boolean match(Object object) {
				return false;
			}
		};
		Expectation<Object> expectation2 = new Expectation<Object>() {
			public boolean match(Object object) {
				return false;
			}
		};
		AndExpectation<Object> and = expectation1.and(expectation2);
		assertTrue(expectation1 == and.getFirst());
		assertTrue(expectation2 == and.getSecond());
	}
	

	@Test
	public void shouldCreateOrExpectation() {
		Expectation<Object> expectation1 = new Expectation<Object>() {
			public boolean match(Object object) {
				return false;
			}
		};
		Expectation<Object> expectation2 = new Expectation<Object>() {
			public boolean match(Object object) {
				return false;
			}
		};
		OrExpectation<Object> and = expectation1.or(expectation2);
		assertTrue(expectation1 == and.getFirst());
		assertTrue(expectation2 == and.getSecond());
	}
	
}
