package by.segg3r.expectunit;

import static by.segg3r.expectunit.Expect.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ExpectTest {

	@Test
	public void shouldCreateExpectorWithProvidedObject() {
		Object obj = new Object();
		Expector<Object> expector = expect(obj);
		assertEquals(obj, expector.getObject());
	}
	
}
