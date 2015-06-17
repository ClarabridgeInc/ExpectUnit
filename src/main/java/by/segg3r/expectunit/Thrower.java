package by.segg3r.expectunit;

public class Thrower<O> {

	private O proxy;

	public Thrower(O proxy) {
		this.proxy = proxy;
	}
	
	public O when() {
		return proxy;
	}
	
}
