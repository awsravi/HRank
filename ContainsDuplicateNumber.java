package com.awsravi.HRank;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateNumber {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        
        for (int num : nums) {
            if (numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        
        boolean result = containsDuplicate(nums);
        System.out.println(result);
        if (result) {
            System.out.println("The array contains duplicate values.");
        } else {
            System.out.println("The array does not contain duplicate values.");
        }
    }
}
