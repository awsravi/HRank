package com.awsravi.HRank;

import java.util.Arrays;

public class AnagramCheckStringJava8 {
    public static boolean isAnagram(String s, String t) {
        // Check if the lengths of the two strings are different
        if (s.length() != t.length()) {
            return false;
        }

        // Convert the strings to character arrays, sort them, and compare
        return Arrays.equals(
            s.chars().sorted().toArray(),
            t.chars().sorted().toArray()
        );
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);
        System.out.println(result);
        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
