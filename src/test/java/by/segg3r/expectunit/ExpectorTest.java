package by.segg3r.expectunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpectorTest {

	@Test
	public void defaultShouldBePositive() {
		Object obj = new Object();
		Expector<Object> expector = new Expector<Object>(obj);
		assertEquals(false, expector.isNegative());
	}
	
	@Test
	public void notShouldBeNegative() {
		Object obj = new Object();
		Expector<Object> expector = new Expector<Object>(obj);
		Expector<Object> notExpector = expector.not();
		assertEquals(true, notExpector.isNegative());
	}
	
	@Test
	public void notShouldBePositiveIfOriginalIsNegative() {
		Object obj = new Object();
		Expector<Object> notExpector = new Expector<Object>(obj, true);
		Expector<Object> expector = notExpector.not();
		assertEquals(false, expector.isNegative());
	}
	
	@Test
	public void notShouldBeWithTheSameObject() {
		Object obj = new Object();
		Expector<Object> expector = new Expector<Object>(obj);
		Expector<Object> notExpector = expector.not();
		assertTrue(expector.getObject() == notExpector.getObject());
	}
	
	@Test
	public void expectorShouldBeImmutable() {
		Object obj = new Object();
		Expector<Object> expector = new Expector<Object>(obj);
		Expector<Object> notExpector = expector.not();
		assertFalse(expector == notExpector);
	}
	
	@Test
	public void positiveExpectation() {
		Object obj = new Object();
		Expector<Object> expector = new Expector<Object>(obj);
		
		Expectation<Object> expectation = new Expectation<Object>() {
			public boolean match(Object object) {
				return true;
			}	
		};
		
		expector.to(expectation);
	}
	
	@Test(expected = AssertionError.class)
	public void negativeExpectation() {
		Object obj = new Object();
		Expector<Object> expector = new Expector<Object>(obj);
		
		Expectation<Object> expectation = new Expectation<Object>() {
			public boolean match(Object object) {
				return false;
			}	
		};
		
		expector.to(expectation);
	}
	
	@Test
	public void notPositiveExpectation() {
		Object obj = new Object();
		Expector<Object> expector = new Expector<Object>(obj, true);
		
		Expectation<Object> expectation = new Expectation<Object>() {
			public boolean match(Object object) {
				return false;
			}	
		};
		
		expector.to(expectation);
	}
	
	@Test(expected = AssertionError.class)
	public void notNegativeExpectation() {
		Object obj = new Object();
		Expector<Object> expector = new Expector<Object>(obj, true);
		
		Expectation<Object> expectation = new Expectation<Object>() {
			public boolean match(Object object) {
				return true;
			}	
		};
		
		expector.to(expectation);
	}
	
}
