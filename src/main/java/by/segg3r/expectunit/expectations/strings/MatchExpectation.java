package by.segg3r.expectunit.expectations.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchExpectation extends StringExpectation {

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

	@Override
	public String getMatchErrorMessage() {
		return "match regular expression " + getAssertionStringObjectRepresentation(other);
	}

}
