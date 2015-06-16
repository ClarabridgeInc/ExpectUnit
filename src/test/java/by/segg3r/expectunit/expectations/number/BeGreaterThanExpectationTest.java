package by.segg3r.expectunit.expectations.number;

import static org.junit.Assert.*;

import org.junit.Test;

import by.segg3r.expectunit.expectations.numbers.BeGreaterThanExpectation;

public class BeGreaterThanExpectationTest {

	@Test
	public void positive() {
		double a = 1.;
		double b = .5;
		BeGreaterThanExpectation<Double> beGreaterThan = new BeGreaterThanExpectation<Double>(b);
		assertTrue(beGreaterThan.match(a));
	}

	@Test
	public void negative() {
		double a = 1.;
		double b = 2.;
		BeGreaterThanExpectation<Double> beGreaterThan = new BeGreaterThanExpectation<Double>(b);
		assertFalse(beGreaterThan.match(a));
	}

}
