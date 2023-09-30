package com.awsravi.HRank;

import java.util.HashMap;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        // Create  HashMap to store
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, add the current element and its index to the HashMap
            map.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array or throw an exception
        throw new IllegalArgumentException("No two elements add up to the target");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = twoSum(nums, target);
        
        System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
    }
}
