/**
 * AlgorithmAnalysis.java
 *
 * Main class to test and compare search algorithms.
 */

public class AlgorithmAnalysis {
    public static void main(String[] args) {

        int[] data = {2, 5, 10, 14, 20, 33, 41, 50};
        int target = 33;

        System.out.println("===== Algorithm Analysis Test =====");

        // Linear Search
        int indexLinear = SearchAlgorithms.linearSearch(data, target);
        System.out.println("Linear Search Result -> index: " + indexLinear);

        // Binary Search
        int indexBinary = SearchAlgorithms.binarySearch(data, target);
        System.out.println("Binary Search Result -> index: " + indexBinary);
    }
}
