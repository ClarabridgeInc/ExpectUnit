package by.segg3r.expectunit;

import java.util.Arrays;
import java.util.Collection;

import by.segg3r.expectunit.expectations.basic.BeExpectation;
import by.segg3r.expectunit.expectations.basic.BeNullExpectation;
import by.segg3r.expectunit.expectations.basic.EqualExpectation;
import by.segg3r.expectunit.expectations.collections.ContainOnlyExpectation;
import by.segg3r.expectunit.expectations.numbers.BeGreaterThanExpectation;
import by.segg3r.expectunit.expectations.numbers.BeLessThanExpectation;
import by.segg3r.expectunit.expectations.strings.MatchExpectation;

public class Expectations {

	public static <O> Expectation<O> beNull() {
		return new BeNullExpectation<O>();
	}
	
	public static <O> Expectation<O> equal(O other) {
		return new EqualExpectation<O>(other);
	}
	
	public static <O> Expectation<O> be(O other) {
		return new BeExpectation<O>(other);
	}
	
	public static <N extends Number> Expectation<N> beGreaterThan(N other) {
		return new BeGreaterThanExpectation<N>(other);
	}
	
	public static <N extends Number> Expectation<N> beLessThan(N other) {
		return new BeLessThanExpectation<N>(other);
	}
	
	public static Expectation<String> contain(String other) {
		return new by.segg3r.expectunit.expectations.strings.ContainExpectation(other);
	}
	
	public static Expectation<String> match(String other) {
		return new MatchExpectation(other);
	}
	
	public static <O> Expectation<Collection<O>> contain(O... entities) {
		return contain(Arrays.asList(entities));
	}
	
	public static <O> Expectation<Collection<O>> contain(Collection<O> entities) {
		return new by.segg3r.expectunit.expectations.collections.ContainExpectation<O>(entities);
	}
	
	public static <O> Expectation<Collection<O>> containOnly(O... entities) {
		return containOnly(Arrays.asList(entities));
	}
	
	public static <O> Expectation<Collection<O>> containOnly(Collection<O> entities) {
		return new ContainOnlyExpectation<O>(entities);
	}
	
	
}
