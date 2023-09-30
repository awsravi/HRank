package com.awsravi.HRank;

import java.util.Arrays;

public class ContainsDuplicateNumberJava8 {
    public static boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums)
                .distinct()
                .count() != nums.length;
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
