package by.segg3r.expectunit.expectations;

import by.segg3r.expectunit.Expectation;

public class AndExpectation<O> extends ExpectationOfTwo<O> {

	public AndExpectation(Expectation<O> first, Expectation<O> second) {
		super(first, second);
	}

	public boolean match(O object) {
		return getFirst().match(object) && getSecond().match(object);
	}

	@Override
	protected String getPrep() {
		return "and";
	}

}
