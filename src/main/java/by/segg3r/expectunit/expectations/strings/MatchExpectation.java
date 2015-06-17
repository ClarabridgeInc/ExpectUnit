package by.segg3r.expectunit.expectations.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.segg3r.expectunit.Expectation;

public class MatchExpectation extends Expectation<String> {

	private String other;
	
	public MatchExpectation(String other) {
		this.other = other;
	}
	
	@Override
	public boolean match(String object) {
		Pattern p = Pattern.compile(other);
		Matcher m = p.matcher(object);
		return m.matches();
	}

	
	
}
