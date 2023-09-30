package com.awsravi.HRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class TwoSumJava8 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        return IntStream.range(0, nums.length)
            .filter(i -> {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return true;
                }
                map.put(nums[i], i);
                return false;
            })
            .mapToObj(i -> new int[]{map.get(target - nums[i]), i})
            .findFirst()
            .get();
           // .orElseThrow(() -> new IllegalArgumentException("No two elements add up to the target"));
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = twoSum(nums, target);
        
        System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
    }
}
