package by.segg3r.expectunit;

public class Expector<O> {
	
	private final O object;
	private final boolean negative;

	public Expector(O object) {
		this(object, false);
	}
	
	public Expector(O object, boolean negative) {
		this.object = object;
		this.negative = negative;
	}
	
	public void to(Expectation<O> expectation) {
		if (expectation.match(object) == negative) {
			throw new AssertionError();
		}
	}
	
	public Expector<O> not() {
		return new Expector<O>(object, !negative);
	}

	public O getObject() {
		return object;
	}
	
	public boolean isNegative() {
		return negative;
	}
	
}
