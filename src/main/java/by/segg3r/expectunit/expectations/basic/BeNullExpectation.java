package by.segg3r.expectunit.expectations.basic;

import by.segg3r.expectunit.Expectation;

public class BeNullExpectation<O> extends Expectation<O> {

	@Override
	public boolean match(O object) {
		return object == null;
	}

}
