package by.segg3r.expectunit;

import by.segg3r.expectunit.expectations.basic.BeExpectation;
import by.segg3r.expectunit.expectations.basic.BeNullExpectation;
import by.segg3r.expectunit.expectations.basic.EqualExpectation;
import by.segg3r.expectunit.expectations.numbers.BeGreaterThanExpectation;

public class Expectations {

	public static <O> BeNullExpectation<O> beNull() {
		return new BeNullExpectation<O>();
	}
	
	public static <O> EqualExpectation<O> equal(O other) {
		return new EqualExpectation<O>(other);
	}
	
	public static <O> BeExpectation<O> be(O other) {
		return new BeExpectation<O>(other);
	}
	
	public static <N extends Number> BeGreaterThanExpectation<N> beGreaterThan(N other) {
		return new BeGreaterThanExpectation<N>(other);
	}
	
}
