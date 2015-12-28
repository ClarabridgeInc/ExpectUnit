package by.segg3r.expectunit;

import by.segg3r.expectunit.expectors.BooleanExpector;
import by.segg3r.expectunit.expectors.NumberExpector;
import by.segg3r.expectunit.expectors.StringExpector;

public class Expect extends Expectations {

	public static <O> Expector<O> expect(O object) {
		return new Expector<O>(object);
	}
	
	public static <N extends Number> NumberExpector<N> expect(N number) {
		return new NumberExpector<N>(number);
	}
	
	public static BooleanExpector expect(Boolean bool) {
		return new BooleanExpector(bool);
	}
	
	public static StringExpector expect(String string) {
		return new StringExpector(string);
	}
	
}
