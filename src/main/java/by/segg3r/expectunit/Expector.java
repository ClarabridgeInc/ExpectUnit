package by.segg3r.expectunit;

import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;

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

	public Thrower<O> toThrow() {
		return this.toThrow(null);
	}
	
	@SuppressWarnings("unchecked")
	public <E extends Exception> Thrower<O> toThrow(Class<E> exceptionClazz) {
		try {
			ProxyFactory factory = new ProxyFactory();
			factory.setSuperclass(object.getClass());
			Class<?> proxyClazz = factory.createClass();

			MethodHandler handler = new ExceptionHandler<E>(exceptionClazz,
					negative);

			Object instance = proxyClazz.newInstance();
			((ProxyObject) instance).setHandler(handler);
			return new Thrower<O>((O) instance);
		} catch (Exception e) {
			throw new AssertionError(e.getMessage(), e);
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
