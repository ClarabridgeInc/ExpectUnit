package by.segg3r.expectunit.expectors;

import static by.segg3r.expectunit.Expect.expect;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import by.segg3r.expectunit.expectations.numbers.BeLessThanExpectation;

public class NumberExpectorTest {

	@Test
	public void toBeGreaterThanPositive() {
		double a = 1.;
		double b = .5;
		expect(a).toBeGreaterThan(b);
	}

	@Test(expected = AssertionError.class)
	public void toBeGreaterThanNegative() {
		double a = 1.;
		double b = 2.;
		expect(a).toBeGreaterThan(b);
	}

	@Test(expected = AssertionError.class)
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

	@Test(expected = AssertionError.class)
	public void toBeLessThanNegative() {
		double a = 1.;
		double b = .5;
		expect(a).toBeLessThan(b);
	}

	@Test(expected = AssertionError.class)
	public void toBeLessThanNegativeEqual() {
		double a = 1.;
		double b = 1.;
		expect(a).toBeLessThan(b);
	}

}
