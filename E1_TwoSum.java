//Given an array of integers nums and an integer target,
//return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution,
//and you may not use the same element twice.

//You can return the answer in any order.

import java.util.HashMap;

// Define a public class named E1_TwoSum
public class E1_TwoSum {
    // Main method where the program execution starts
    public static void main(String[] args) {
        // Create an instance of the SolutionE1 class
        SolutionE1 solutionE1 = new SolutionE1();

        // Define an array of numbers
        int[] numbers = {2, 7, 11, 15};
        // Define the target sum
        int target = 9;

        // Call the twoSum method from the SolutionE1 class
        int[] result = solutionE1.twoSum(numbers, target);

        // Check if a valid result is obtained
        if (result != null) {
            // Print the indices of the numbers that sum to the target
            System.out.println("Indices of the numbers that sum to the target: " + result[0] + ", " + result[1]);
        } else {
            // Print a message if no two numbers are found that sum to the target
            System.out.println("No two numbers found that sum to the target.");
        }
    }
}

// Define a separate class named SolutionE1
class SolutionE1 {
    // Define a method named twoSum that takes an array of numbers and a target sum as parameters
    public int[] twoSum(int[] numbers, int target) {
        // Create a HashMap to store the numbers and their corresponding indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array of numbers
        for (int i = 0; i < numbers.length; i++) {
            // Calculate the complement (x) needed to reach the target sum
            //Example: 2 + x = 9
            //x = 9 - 2
            //x = 7
            int x = target - numbers[i];

            // Check if the complement (x) is already in the map
            if (map.containsKey(x)) {
                // If found, return the indices of the two numbers that sum to the target
                return new int[]{map.get(x), i};
            }
            // If not found, add the current number and its index to the map
            map.put(numbers[i], i);
        }
        // If no such pair is found, return null
        return null;
    }
}