package by.segg3r.expectunit.expectors;

import static by.segg3r.expectunit.Expect.expect;
import static org.testng.Assert.assertTrue;

import by.segg3r.expectunit.expectations.numbers.BeLessThanExpectation;
import org.testng.annotations.Test;

public class NumberExpectorTest {

	@Test
	public void toBeGreaterThanPositive() {
		double a = 1.;
		double b = .5;
		expect(a).toBeGreaterThan(b);
	}

	@Test(
			expectedExceptions = AssertionError.class,
			expectedExceptionsMessageRegExp = "Expected 1.0 to be greater than 2.0")
	public void toBeGreaterThanNegative() {
		double a = 1.;
		double b = 2.;
		expect(a).toBeGreaterThan(b);
	}

	@Test(
			expectedExceptions = AssertionError.class,
			expectedExceptionsMessageRegExp = "Expected 1.0 to be greater than 1.0")
	public void toBeGreaterThanNegativeEqual() {
		double a = 1.;
		double b = 1.;
		expect(a).toBeGreaterThan(b);
	}

	@Test
	public void toBeLessThanPositive() {
		double a = 1.;
		double b = 1.5;
		expect(a).toBeLessThan(b);
		BeLessThanExpectation<Double> beLessThan = new BeLessThanExpectation<Double>(
				b);
		assertTrue(beLessThan.match(a));
	}

	@Test(
			expectedExceptions = AssertionError.class,
			expectedExceptionsMessageRegExp = "Expected 1.0 to be less than 0.5")
	public void toBeLessThanNegative() {
		double a = 1.;
		double b = .5;
		expect(a).toBeLessThan(b);
	}

	@Test(
			expectedExceptions = AssertionError.class,
			expectedExceptionsMessageRegExp = "Expected 1.0 to be less than 1.0")
	public void toBeLessThanNegativeEqual() {
		double a = 1.;
		double b = 1.;
		expect(a).toBeLessThan(b);
	}

}
