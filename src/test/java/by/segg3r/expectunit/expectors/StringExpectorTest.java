package by.segg3r.expectunit.expectors;

import static by.segg3r.expectunit.Expect.expect;

import org.junit.Test;

public class StringExpectorTest {

	@Test
	public void toContainPositive() {
		expect("Hello world").toContain("world");
	}

	@Test(expected = AssertionError.class)
	public void toContainNegative() {
		expect("Hello world").toContain("words");
	}

	@Test
	public void toMatchPositive() {
		expect("Hello world").toMatch("H.*d");
	}

	@Test(expected = AssertionError.class)
	public void toMatchNegative() {
		expect("Hello words").toMatch("H.*d");
	}

}
