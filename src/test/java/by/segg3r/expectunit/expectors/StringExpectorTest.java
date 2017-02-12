package by.segg3r.expectunit.expectors;

import org.testng.annotations.Test;

import static by.segg3r.expectunit.Expect.expect;

public class StringExpectorTest {

	@Test
	public void toContainPositive() {
		expect("Hello world").toContain("world");
	}

	@Test(expectedExceptions = AssertionError.class)
	public void toContainNegative() {
		expect("Hello world").toContain("words");
	}

	@Test
	public void toMatchPositive() {
		expect("Hello world").toMatch("H.*d");
	}

	@Test(expectedExceptions = AssertionError.class)
	public void toMatchNegative() {
		expect("Hello words").toMatch("H.*d");
	}

}
