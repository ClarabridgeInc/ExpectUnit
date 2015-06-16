package by.segg3r.expectunit.expectations.basic;

import by.segg3r.expectunit.Expectation;

public class BeExpectation<O> extends Expectation<O> {

	private O other;

	public BeExpectation(O other) {
		this.other = other;
	}
	
	@Override
	public boolean match(O object) {
		return object == other;
	}

}
