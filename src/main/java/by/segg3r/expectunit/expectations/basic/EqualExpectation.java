package by.segg3r.expectunit.expectations.basic;

import by.segg3r.expectunit.Expectation;

public class EqualExpectation<O> extends Expectation<O> {

	private O other;

	public EqualExpectation(O other) {
		this.other = other;
	}
	
	@Override
	public boolean match(O object) {
		return object.equals(other);
	}

	@Override
	public String getMatchErrorMessage() {
		return "equal " + other;
	}

}
