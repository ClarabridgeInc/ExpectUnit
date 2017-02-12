package by.segg3r.expectunit.expectations.booleans;

import by.segg3r.expectunit.Expectation;

public class BeFalsyExpectation extends Expectation<Boolean> {

	@Override
	public boolean match(Boolean object) {
		return !object;
	}

	@Override
	public String getMatchErrorMessage() {
		return "be falsy";
	}

}
