package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.
		String[] words = { "lol", "hi", "hey" };
		assertEquals(0, _00_LinearSearch.linearSearch(words, "lol"));
		String[] hey = { "wow", "wowu", "yay", "yayu", "nice", "nicu" };
		assertEquals(3, _00_LinearSearch.linearSearch(hey, "yayu"));
		String[] bye = { "no", "nope", "nuhuh", "nein", "negatory" };
		assertEquals(-1, _00_LinearSearch.linearSearch(bye, "yes"));
	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
	}
}
