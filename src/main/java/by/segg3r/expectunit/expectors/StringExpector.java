package by.segg3r.expectunit.expectors;

import by.segg3r.expectunit.Expectation;
import by.segg3r.expectunit.Expectations;
import by.segg3r.expectunit.Expector;

public class StringExpector extends Expector<String> {

	public StringExpector(String string) {
		super(string);
	}

	public StringExpector(String string, boolean negative) {
		super(string, negative);
	}
	
	@Override
	public StringExpector not() {
		return new StringExpector(getObject(), !isNegative());
	}
	
	public Expectation<String> toContain(String other) {
		return this.to(Expectations.contain(other));
	}
	
	public Expectation<String> toMatch(String other) {
		return this.to(Expectations.match(other));
	}
	
}
