package by.segg3r.expectunit.expectors;

import org.testng.annotations.Test;

import static by.segg3r.expectunit.Expect.expect;

import java.util.Arrays;

public class CollectionExpectorTest {

	@Test
	public void toContainPositive() {
		expect(Arrays.asList(new Integer[] { 1, 2, 3 })).toContain(
				Arrays.asList(new Integer[] { 1, 2 }));
	}

	@Test
	public void toContainArrayPositive() {
		expect(Arrays.asList(new Integer[] { 1, 2, 3 })).toContain(1, 2);
	}

	@Test(
			expectedExceptions = AssertionError.class,
			expectedExceptionsMessageRegExp = "Expected \\[1, 3\\] to contain \\[1, 2\\]")
	public void toContainNegative() {
		expect(Arrays.asList(new Integer[] { 1, 3 })).toContain(
				Arrays.asList(new Integer[] { 1, 2 }));
	}

	@Test(
			expectedExceptions = AssertionError.class,
			expectedExceptionsMessageRegExp = "Expected \\[1, 3\\] to contain \\[1, 2\\]")
	public void toContainArrayNegative() {
		expect(Arrays.asList(new Integer[] { 1, 3 })).toContain(1, 2);
	}

	@Test
	public void toContainOnlyPositive() {
		expect(Arrays.asList(new Integer[] { 1, 2, 3 })).toContainOnly(
				Arrays.asList(new Integer[] { 1, 2, 3 }));
	}

	@Test
	public void toContainOnlyArrayPositive() {
		expect(Arrays.asList(new Integer[] { 1, 2, 3 })).toContainOnly(1, 2, 3);
	}

	@Test(
			expectedExceptions = AssertionError.class,
			expectedExceptionsMessageRegExp = "Expected \\[1, 3\\] to contain only \\[1\\]")
	public void toContainOnlyNegative() {
		expect(Arrays.asList(new Integer[] { 1, 3 })).toContainOnly(
				Arrays.asList(new Integer[] { 1 }));
	}

	@Test(
			expectedExceptions = AssertionError.class,
			expectedExceptionsMessageRegExp = "Expected \\[1, 3\\] to contain only \\[1\\]")
	public void toContainOnlyArrayNegative() {
		expect(Arrays.asList(new Integer[] { 1, 3 })).toContainOnly(1);
	}
}
