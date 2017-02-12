package by.segg3r.expectunit.expectations;

import by.segg3r.expectunit.Expectation;

public abstract class ExpectationOfTwo<O> extends Expectation<O> {

	private final Expectation<O> first;
	private final Expectation<O> second;

	public ExpectationOfTwo(Expectation<O> first, Expectation<O> second) {
		this.first = first;
		this.second = second;
	}

	public Expectation<O> getFirst() {
		return first;
	}

	public Expectation<O> getSecond() {
		return second;
	}

	@Override
	public String getMatchErrorMessage() {
		return getFirst().getMatchErrorMessage() + " " + getPrep() + " " + getSecond().getMatchErrorMessage();
	}

	protected abstract String getPrep();

}
