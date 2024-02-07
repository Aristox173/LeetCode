//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//typically using all the original letters exactly once.

import java.util.Arrays;
import java.util.HashMap;

// Define a public class named E242_ValidAnagram
public class E242_ValidAnagram {
    // Main method where the program execution starts
    public static void main(String[] args) {
        // Create an instance of the SolutionE1 class
        SolutionE242 solution = new SolutionE242();

        // Example 1: Anagrams
        String s1 = "listen";
        String t1 = "silent";
        // Call the isAnagram method from the SolutionE242 class
        boolean result1 = solution.isAnagram(s1, t1);
        // Print the result
        System.out.println(s1 + " and " + t1 + " are anagrams: " + result1);

        // Example 2: Not Anagrams
        String s2 = "hello";
        String t2 = "world";
        // Call the isAnagram method from the SolutionE242 class
        boolean result2 = solution.isAnagram(s2, t2);
        // Print the result
        System.out.println(s2 + " and " + t2 + " are anagrams: " + result2);
    }
}

// Define a separate class named SolutionE242
class SolutionE242 {
    // Define a method named isAnagram that takes two strings as parameters
    public boolean isAnagram(String s, String t) {
        // Convert strings to character arrays
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        // Check if the sorted arrays are equal
        return Arrays.equals(charArrayS, charArrayT);
    }
}