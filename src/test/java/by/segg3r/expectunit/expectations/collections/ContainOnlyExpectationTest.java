package by.segg3r.expectunit.expectations.collections;

import java.util.Arrays;

import org.junit.Test;

public class ContainOnlyExpectationTest {

	@Test
	public void positive() {
		new ContainOnlyExpectation<Integer>(
				Arrays.asList(new Integer[] { 1, 2, 3 })).match(Arrays
				.asList(new Integer[] { 1, 2, 3 }));
	}

	@Test
	public void negative() {
		new ContainOnlyExpectation<Integer>(
				Arrays.asList(new Integer[] { 1, 2, 3 })).match(Arrays
				.asList(new Integer[] { 1, 2 }));
	}

}
