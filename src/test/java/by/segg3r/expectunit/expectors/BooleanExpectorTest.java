package by.segg3r.expectunit.expectors;

import org.testng.annotations.Test;

import static by.segg3r.expectunit.Expect.expect;

public class BooleanExpectorTest {

	@Test
	public void toBeTruthyPositive() {
		expect(true).toBeTruthy();
	}
	
	@Test(
			expectedExceptions = AssertionError.class,
			expectedExceptionsMessageRegExp = "Expected false to be truthy")
	public void toBeTruthyNegative() {
		expect(false).toBeTruthy();
	}
	
	@Test
	public void toBeFalsyPositive() {
		expect(false).toBeFalsy();
	}
	
	@Test(
			expectedExceptions = AssertionError.class,
			expectedExceptionsMessageRegExp = "Expected true to be falsy")
	public void toBeFalsyNegative() {
		expect(true).toBeFalsy();
	}

}
