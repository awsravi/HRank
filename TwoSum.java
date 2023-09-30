package com.awsravi.HRank;

import java.util.ArrayList;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Iterate through the array with two nested loops
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the pair of elements sum up to the target
                if (nums[i] + nums[j] == target) {
                    // Return the indices of the two numbers
                    return new int[] { i, j };
                }
            }
        }
		return nums;
        
        // If no solution is found, return an empty array or throw an exception
       // throw new IllegalArgumentException("No two elements add up to the target");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        /* 
         int[] nums={3,2,4};
          int target =6;
          
          */
        
        int[] result = twoSum(nums, target);
        
        System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
    }
}

