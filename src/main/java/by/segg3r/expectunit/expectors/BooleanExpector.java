package by.segg3r.expectunit.expectors;

import by.segg3r.expectunit.Expectation;
import by.segg3r.expectunit.Expectations;
import by.segg3r.expectunit.Expector;

public class BooleanExpector extends Expector<Boolean> {

	public BooleanExpector(Boolean bool) {
		super(bool);
	}

	public BooleanExpector(Boolean bool, boolean negative) {
		super(bool, negative);
	}
	
	@Override
	public BooleanExpector not() {
		return new BooleanExpector(getObject(), !isNegative());
	}
	
	public Expectation<Boolean> toBeTruthy() {
		return this.to(Expectations.beTruthy());
	}
	
	public Expectation<Boolean> toBeFalsy() {
		return this.to(Expectations.beFalsy());
	}
	
}
