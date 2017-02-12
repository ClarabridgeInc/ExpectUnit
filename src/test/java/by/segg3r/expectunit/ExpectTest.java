package by.segg3r.expectunit;

import org.testng.annotations.Test;

import static by.segg3r.expectunit.Expect.*;
import static org.testng.Assert.assertEquals;

public class ExpectTest {

	@Test
	public void shouldCreateExpectorWithProvidedObject() {
		Object obj = new Object();
		Expector<Object> expector = expect(obj);
		assertEquals(expector.getObject(), obj);
	}
	
}
