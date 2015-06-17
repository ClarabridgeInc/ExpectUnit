package by.segg3r.expectunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javassist.util.proxy.MethodHandler;

public class ExceptionHandler<E> implements MethodHandler {

	private Class<E> clazz;
	private boolean negative;

	public ExceptionHandler(Class<E> clazz, boolean negative) {
		this.clazz = clazz;
		this.negative = negative;
	}

	public Object invoke(Object self, Method thisMethod, Method proceed,
			Object[] args) throws Throwable {
		Exception caught = null;
		Object obj = null;
		try {
			obj = proceed.invoke(self, args);
		} catch (Exception e) {
			caught = e;
		}

		if (caught == null && !negative) {
			throw new AssertionError();
		}
		if (caught == null && negative) {
			return obj;
		}
		if (caught != null) {
			if ((caught.getClass().equals(InvocationTargetException.class) && (clazz == null || caught
					.getCause().getClass().isAssignableFrom(clazz))) == negative)
				throw new AssertionError();
		}

		return obj;

	}

}
