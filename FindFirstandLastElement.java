package com.awsravi.HRank;

public class FindFirstandLastElement {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 2, 3, 4, 4, 5 };
		int target = 2;

		int[] result = findFirstLastPosition(nums, target);
		System.out.println("First Position: " + result[0]);
		System.out.println("Last Position: " + result[1]);
	}

	public static int[] findFirstLastPosition(int[] nums, int target) {
		int[] result = { -1, -1 };

		// Find the first occurrence (left boundary)
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				result[0] = i;
				break;
			}
		}

		// Find the last occurrence (right boundary)
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == target) {
				result[1] = i;
				break;
			}
		}

		return result;
	}
}
