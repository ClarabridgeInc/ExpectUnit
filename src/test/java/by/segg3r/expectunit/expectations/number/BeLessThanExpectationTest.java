package by.segg3r.expectunit.expectations.number;

import static org.junit.Assert.*;

import org.junit.Test;

import by.segg3r.expectunit.expectations.numbers.BeLessThanExpectation;

public class BeLessThanExpectationTest {

	@Test
	public void positive() {
		double a = 1.;
		double b = 1.5;
		BeLessThanExpectation<Double> beLessThan = new BeLessThanExpectation<Double>(b);
		assertTrue(beLessThan.match(a));
	}

	@Test
	public void negative() {
		double a = 1.;
		double b = .5;
		BeLessThanExpectation<Double> beLessThan = new BeLessThanExpectation<Double>(b);
		assertFalse(beLessThan.match(a));
	}
	
	@Test
	public void negativeEqual() {
		double a = 1.;
		double b = 1.;
		BeLessThanExpectation<Double> beLessThan = new BeLessThanExpectation<Double>(b);
		assertFalse(beLessThan.match(a));
	}

}
