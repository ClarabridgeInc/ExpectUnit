package by.segg3r.expectunit;

import by.segg3r.expectunit.expectations.AndExpectation;
import by.segg3r.expectunit.expectations.OrExpectation;

public abstract class Expectation<O> {

	public AndExpectation<O> and(Expectation<O> second) {
		return new AndExpectation<O>(this, second);
	}
	
	public OrExpectation<O> or(Expectation<O> second) {
		return new OrExpectation<O>(this, second);
	}
	
	public abstract boolean match(O object);
	
}
