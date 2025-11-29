/**
 * SearchAlgorithms.java
 *
 * Demonstrates algorithm design and Big-O analysis for two search methods:
 * 1. Linear Search
 * 2. Binary Search
 *
 * Author: Your Name
 * Date: YYYY-MM-DD
 */

public class SearchAlgorithms {

    /**
     * Linear Search
     * -------------------------------------------------------
     * Scans each element until target is found or end is reached.
     *
     * Algorithm Steps:
     * 1. Iterate through the array from index 0 → n-1
     * 2. Compare each element with the target
     * 3. If equal, return its index
     * 4. If not found, return -1
     *
     * Time Complexity:
     *  - Best Case: O(1)       (first element is target)
     *  - Worst Case: O(n)      (last element or not found)
     *
     * Space Complexity: O(1)   (uses constant extra variables)
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    /**
     * Binary Search
     * -------------------------------------------------------
     * Requires sorted array!
     *
     * Algorithm Steps:
     * 1. Set left and right pointers
     * 2. Check middle
     * 3. If mid == target → return mid
     * 4. If target < mid → search left sub-array
     * 5. Else → search right sub-array
     *
     * Time Complexity:
     *  - Best Case: O(1)
     *  - Worst Case: O(log n)
     *
     * Space Complexity:
     *  - Iterative: O(1)
     *  - Recursive: O(log n) stack
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;

            if (target < arr[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1; // not found
    }
}
