//Given an array of integers nums and an integer target,
//return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution,
//and you may not use the same element twice.

//You can return the answer in any order.

import java.util.HashMap;

public class E1_TwoSum {
    public static void main(String[] args) {
        SolutionE1 solutionE1 = new SolutionE1();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = solutionE1.twoSum(numbers, target);

        if (result != null) {
            System.out.println("Indices of the numbers that sum to the target: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found that sum to the target.");
        }
    }
}

class SolutionE1 {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            //Example: 2 + x = 9
            //x = 9 - 2
            //x = 7
            int x = target - numbers[i];

            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}