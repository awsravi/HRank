package com.awsravi.HRank;

import java.util.Arrays;

public class AnagramCheckString {
    public static boolean isAnagram(String s, String t) {
        // Check if the lengths of the two strings are different
        if (s.length() != t.length()) {
            return false;
        }
        
        // Convert the strings to character arrays and sort them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        // Compare the sorted arrays
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }
}
