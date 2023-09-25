package com.awsravi.HRank;

import java.util.stream.IntStream;

public class FindFirstLastPositionjava8 {

	public static int[] searchRange(int[] nums, int target) {
		int first = IntStream.range(0, nums.length)
				.filter(i -> nums[i] == target).findFirst().orElse(-1);

		int last = IntStream.range(0, nums.length)
				.filter(i -> nums[i] == target).reduce((a, b) -> b).orElse(-1);

		return new int[] { first, last };
	}

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 8, 10 };
		int target = 8;
		int[] result = searchRange(nums, target);

		System.out.println("First Position: " + result[0]);
		System.out.println("Last Position: " + result[1]);

	}
}
