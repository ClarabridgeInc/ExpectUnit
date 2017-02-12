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

	/**
	 * @return Should provide string representation of assertable object for assertion error message.
	 * For example, strings would be return in double quotes to improve readability.
	 */
	public String getAssertionStringObjectRepresentation(O object) {
		return object.toString();
	}

	/**
	 * @return Should provide sentence ending for sentence "Expected _smth_ to ..."
	 */
	public abstract String getMatchErrorMessage();

}
