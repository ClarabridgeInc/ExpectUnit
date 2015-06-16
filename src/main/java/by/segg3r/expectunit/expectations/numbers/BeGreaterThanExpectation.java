package by.segg3r.expectunit.expectations.numbers;

import by.segg3r.expectunit.Expectation;

public class BeGreaterThanExpectation<N extends Number> extends Expectation<N> {

	private N other;

	public BeGreaterThanExpectation(N other) {
		this.other = other;
	}
	
	@Override
	public boolean match(N object) {
		return object.doubleValue() > other.doubleValue();
	}

}
