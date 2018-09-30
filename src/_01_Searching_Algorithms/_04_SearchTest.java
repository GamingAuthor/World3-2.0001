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
		int[] hey = {1,2,3,4,5,6};
		assertEquals(-1,_01_BinarySearch.binarySearch(hey,0,5,7));
		assertEquals(3,_01_BinarySearch.binarySearch(hey,0,5,4));
		assertEquals(2,_01_BinarySearch.binarySearch(hey,0,2,3));
		}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		int yo[] = {2,4,6,8,10};
		assertEquals(2,_02_InterpolationSearch.interpolationSearch(yo,6));
		int ba[] = {25,75,125,175,225};
		assertEquals(3,_02_InterpolationSearch.interpolationSearch(ba,175));
		int ray[] = {85,170,255,340};
		assertEquals(-1,_02_InterpolationSearch.interpolationSearch(ray,25));
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		int[] hey = {1,2,3,4,5,6};
		assertEquals(-1,_03_ExponentialSearch.exponentialSearch(hey, 8));
		int yo[] = {2,4,6,8,10};
		assertEquals(2,_03_ExponentialSearch.exponentialSearch(yo,6));
		assertEquals(1,_03_ExponentialSearch.exponentialSearch(hey,2));
		assertEquals(-1,_03_ExponentialSearch.exponentialSearch(yo,18));
	}
}
