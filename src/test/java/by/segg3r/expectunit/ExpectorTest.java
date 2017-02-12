package by.segg3r.expectunit;

import org.testng.annotations.Test;

import static by.segg3r.expectunit.Expect.expect;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ExpectorTest {

	@Test
	public void defaultShouldBePositive() {
		Object obj = new Object();
		Expector<Object> expector = new Expector<Object>(obj);
		assertFalse(expector.isNegative());
	}
	
	@Test
	public void notShouldBeNegative() {
		Object obj = new Object();
		Expector<Object> expector = new Expector<Object>(obj);
		Expector<Object> notExpector = expector.not();
		assertTrue(notExpector.isNegative());
	}
	
	@Test
	public void notShouldBePositiveIfOriginalIsNegative() {
		Object obj = new Object();
		Expector<Object> notExpector = new Expector<Object>(obj, true);
		Expector<Object> expector = notExpector.not();
		assertFalse(expector.isNegative());
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
	
	@Test(expectedExceptions = AssertionError.class)
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
	
	@Test(expectedExceptions = AssertionError.class)
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
	
	public static class ThrowerSample {
		public ThrowerSample() {
			
		}
		
		public void throwingNullPointer() {
			throw new NullPointerException();
		}
		
		public int notThrowingAnything() {
			return 10;
		}
	}
	
	@Test
	public void toThrowPositive() {
		ThrowerSample thrower = new ThrowerSample();
		Expector<ThrowerSample> expector = new Expector<ThrowerSample>(thrower);
		expector.toThrow(NullPointerException.class).when().throwingNullPointer();
	}
	
	@Test(expectedExceptions = AssertionError.class)
	public void toThrowNegativeWrongClass() {
		ThrowerSample thrower = new ThrowerSample();
		Expector<ThrowerSample> expector = new Expector<ThrowerSample>(thrower);
		expector.toThrow(ArrayIndexOutOfBoundsException.class).when().throwingNullPointer();
	}
	
	@Test(expectedExceptions = AssertionError.class)
	public void toThrowNegativeNotThrowing() {
		ThrowerSample thrower = new ThrowerSample();
		Expector<ThrowerSample> expector = new Expector<ThrowerSample>(thrower);
		expector.toThrow(ArrayIndexOutOfBoundsException.class).when().notThrowingAnything();
	}
	
	@Test
	public void notToThrowPositive() {
		ThrowerSample thrower = new ThrowerSample();
		Expector<ThrowerSample> expector = new Expector<ThrowerSample>(thrower);
		expector.not().toThrow(NullPointerException.class).when().notThrowingAnything();
	}
	
	@Test(expectedExceptions = AssertionError.class)
	public void notToThrowNegative() {
		ThrowerSample thrower = new ThrowerSample();
		Expector<ThrowerSample> expector = new Expector<ThrowerSample>(thrower);
		expector.not().toThrow(NullPointerException.class).when().throwingNullPointer();
	}
	
	@Test
	public void notToThrowJustPositive() {
		ThrowerSample thrower = new ThrowerSample();
		Expector<ThrowerSample> expector = new Expector<ThrowerSample>(thrower);
		expector.not().toThrow().when().notThrowingAnything();
	}
	
	@Test(expectedExceptions = AssertionError.class)
	public void notToThrowJustNegative() {
		ThrowerSample thrower = new ThrowerSample();
		Expector<ThrowerSample> expector = new Expector<ThrowerSample>(thrower);
		expector.not().toThrow().when().throwingNullPointer();
	}
	
	@Test
	public void toThrowJustPositive() {
		ThrowerSample thrower = new ThrowerSample();
		Expector<ThrowerSample> expector = new Expector<ThrowerSample>(thrower);
		expector.toThrow().when().throwingNullPointer();
	}
	
	@Test(expectedExceptions = AssertionError.class)
	public void toThrowJustNegative() {
		ThrowerSample thrower = new ThrowerSample();
		Expector<ThrowerSample> expector = new Expector<ThrowerSample>(thrower);
		expector.toThrow().when().notThrowingAnything();
	}
	
	@Test
	public void toBePositive() {
		Object object = new Object();
		expect(object).toBe(object);
	}
	
	@Test(expectedExceptions = AssertionError.class)
	public void toBeNegative() {
		Object object = new Object();
		Object anotherObject = new Object();
		expect(object).toBe(anotherObject);
	}
	
	@Test
	public void toEqualPositive() {
		Object object = new Object();
		expect(object).toEqual(object);
	}
	
	@Test(expectedExceptions = AssertionError.class)
	public void toEqualNegative() {
		Object object = new Object();
		Object anotherObject = new Object();
		expect(object).toEqual(anotherObject);
	}

	@Test
	public void toBeNullPositive() {
		Object obj = null;
		expect(obj).toBeNull();
	}

	@Test(expectedExceptions = AssertionError.class)
	public void toBeNullNegative() {
		Object obj = new Object();
		expect(obj).toBeNull();
	}
}
