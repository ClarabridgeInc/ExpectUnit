package by.segg3r.expectunit.expectations.strings;

import by.segg3r.expectunit.Expectation;

public class ContainExpectation extends Expectation<String> {

	private String other;
	
	public ContainExpectation(String other) {
		this.other = other;
	}
	
	@Override
	public boolean match(String object) {
		return object.contains(other);
	}

	
	
}
