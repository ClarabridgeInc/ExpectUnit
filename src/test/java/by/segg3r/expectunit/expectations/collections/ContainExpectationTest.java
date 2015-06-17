package by.segg3r.expectunit.expectations.collections;

import java.util.Arrays;

import org.junit.Test;

public class ContainExpectationTest {

	@Test
	public void positive() {
		new ContainExpectation<Integer>(
				Arrays.asList(new Integer[] { 1, 2, 3 })).match(Arrays
				.asList(new Integer[] { 1, 2 }));
	}

	@Test
	public void negative() {
		new ContainExpectation<Integer>(
				Arrays.asList(new Integer[] { 1, 3 })).match(Arrays
				.asList(new Integer[] { 1, 2 }));
	}

}
