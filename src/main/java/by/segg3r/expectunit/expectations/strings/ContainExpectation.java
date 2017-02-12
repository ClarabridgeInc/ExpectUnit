package by.segg3r.expectunit.expectations.strings;

public class ContainExpectation extends StringExpectation {

	private String other;
	
	public ContainExpectation(String other) {
		this.other = other;
	}
	
	@Override
	public boolean match(String object) {
		return object.contains(other);
	}

	@Override
	public String getMatchErrorMessage() {
		return "contain " + getAssertionStringObjectRepresentation(other);
	}

}
