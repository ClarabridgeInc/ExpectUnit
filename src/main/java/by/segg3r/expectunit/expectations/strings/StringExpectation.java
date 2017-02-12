package by.segg3r.expectunit.expectations.strings;

import by.segg3r.expectunit.Expectation;

public abstract class StringExpectation extends Expectation<String> {

	@Override
	public String getAssertionStringObjectRepresentation(String object) {
		return "\"" + object + "\"";
	}

}
