//Given an array of strings strs, group the anagrams together. You can return the answer in any order.

//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//typically using all the original letters exactly once.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Define a public class named E46_GroupAnagrams
public class E46_GroupAnagrams {
    // Main method where the program execution starts
    public static void main(String[] args) {
        // Create an instance of SolutionE46 class
        SolutionE46 solution = new SolutionE46();

        // Example test data
        String[] testStrings = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Call the groupAnagrams method from the SolutionE46 class
        List<List<String>> result = solution.groupAnagrams(testStrings);

        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}

// Define a separate class named SolutionE46
class SolutionE46{
    // Define a method named groupAnagrams that takes an array of strings as parameter
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store the sortedString and the list of strings that are anagrams of each other
        HashMap <String, List<String>> map = new HashMap<>();

        // Iterate through the array of strings
        for (int i = 0; i < strs.length; i++) {
            // Convert string to character array
            char[] charArray = strs[i].toCharArray();

            // Sort the character array
            Arrays.sort(charArray);

            //Create a string of the sorted character array
            String sortedString = Arrays.toString(charArray);

            // Check if the sortedString is already in the map
            if (map.containsKey(sortedString)){
                //Get the key, and add the word to the list
                map.get(sortedString).add(strs[i]);
            }else{ //If the sortedString isn't in the map,
                //Create a new list
                List newList = new ArrayList<String>();
                //Add the word to the list
                newList.add(strs[i]);
                //Put the sorted string as key, and the created list as the value
                map.put(sortedString, newList);
            }
        }
        //Return the ArrayList with the values of the map
        return new ArrayList<>(map.values());
    }
}