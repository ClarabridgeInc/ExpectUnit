package by.segg3r.expectunit.expectors;

import static by.segg3r.expectunit.Expect.expect;

import org.junit.Test;

public class BooleanExpectorTest {

	@Test
	public void toBeTruthyPositive() {
		expect(true).toBeTruthy();
	}
	
	@Test(expected = AssertionError.class)
	public void toBeTruthyNegative() {
		expect(false).toBeTruthy();
	}
	
	@Test
	public void toBeFalsyPositive() {
		expect(false).toBeFalsy();
	}
	
	@Test(expected = AssertionError.class)
	public void toBeFalsyNegative() {
		expect(true).toBeFalsy();
	}

}
