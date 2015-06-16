package by.segg3r.expectunit;

public class Expect {

	public static <O> Expector<O> expect(O object) {
		return new Expector<O>(object);
	}
	
}
