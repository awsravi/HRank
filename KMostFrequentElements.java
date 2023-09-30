package com.awsravi.HRank;

import java.util.*;

public class KMostFrequentElements {
    public List<Integer> kMostFrequent(int[] nums, int k) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a PriorityQueue (Min Heap) to maintain the k most frequent elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> frequencyMap.get(a) - frequencyMap.get(b));

        for (int num : frequencyMap.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the least frequent element if the heap size exceeds k
            }
        }

        // Create a result list
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }
        Collections.reverse(result); 
        // Reverse the result list to get elements in descending order of frequency

        return result;
    }

    public static void main(String[] args) {
        KMostFrequentElements solution = new KMostFrequentElements();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> result = solution.kMostFrequent(nums, k);
        System.out.println(result); // Output: [1, 2]
    }
}
