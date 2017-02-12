package by.segg3r.expectunit.expectations.numbers;

import by.segg3r.expectunit.Expectation;

public class BeLessThanExpectation<N extends Number> extends Expectation<N> {

	private N other;

	public BeLessThanExpectation(N other) {
		this.other = other;
	}
	
	@Override
	public boolean match(N object) {
		return object.doubleValue() < other.doubleValue();
	}

	@Override
	public String getMatchErrorMessage() {
		return "be less than " + other;
	}

}
