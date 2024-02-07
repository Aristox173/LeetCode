//Given an integer array nums, return true if any value appears at least twice in the array,
//and return false if every element is distinct.

import java.util.HashSet;

// Define a public class named E217_ContainsDuplicate
public class E217_ContainsDuplicate {
    // Main method where the program execution starts
    public static void main(String[] args) {
        // Create an instance of the SolutionE1 class
        SolutionE217 solutionE217 = new SolutionE217();

        // Define an array of numbers
        int[] nums = {1, 2, 3, 1};

        // Call the containsDuplicate method from the SolutionE217 class
        boolean result = solutionE217.containsDuplicate(nums);
        // Print the result
        System.out.println("Array contains duplicates: " + result);
    }
}

// Define a separate class named SolutionE217
class SolutionE217 {
    // Define a method named containsDuplicate that takes an array of numbers as parameter
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store the numbers
        HashSet<Integer> set = new HashSet<>();

        // Iterate through the array of numbers
        for (int i = 0; i < nums.length; i++) {
            // Check if the number is already in the set
            if (set.contains(nums[i])) {
                // If found, return true
                return true;
            }
            // If not found, add the current number to the set
            set.add(nums[i]);
        }
        //If every element is distinct, return false
        return false;
    }
}