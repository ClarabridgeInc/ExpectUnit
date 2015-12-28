package by.segg3r.expectunit.expectors;

import by.segg3r.expectunit.Expectation;
import by.segg3r.expectunit.Expectations;
import by.segg3r.expectunit.Expector;

public class NumberExpector<N extends Number> extends Expector<N> {

	public NumberExpector(N number) {
		super(number);
	}

	public NumberExpector(N number, boolean negative) {
		super(number, negative);
	}
	
	@Override
	public NumberExpector<N> not() {
		return new NumberExpector<N>(getObject(), !isNegative());
	}
	
	public Expectation<N> toBeGreaterThan(N other) {
		return this.to(Expectations.<N>beGreaterThan(other));
	}
	
	public Expectation<N> toBeLessThan(N other) {
		return this.to(Expectations.<N>beLessThan(other));
	}
	
}
