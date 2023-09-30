package com.awsravi.HRank;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class KMostFrequentJava8 {
    public List<Integer> kMostFrequent(int[] nums, int k) {
        // Create a frequency map using streams
        Map<Integer, Long> frequencyMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Sort the map entries by frequency in descending order
        List<Integer> result = frequencyMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return result;
    }

    public static void main(String[] args) {
        KMostFrequentElements solution = new KMostFrequentElements();
        int[] nums = {1, 1, 1, 2, 2, 3,4};
        //int k = 1;
        int k=2;
        List<Integer> result = solution.kMostFrequent(nums, k);
        System.out.println(result); // Output: [1, 2]
    }
}
