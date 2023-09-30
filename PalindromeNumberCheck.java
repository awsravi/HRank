package com.awsravi.HRank;
public class PalindromeNumberCheck {
    public static boolean isPalindrome(int x) {
        // Convert the integer to a string for easy comparison
        String str = Integer.toString(x);
        
        // Use two pointers to compare characters from the start and end
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters do not match, not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // All characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        int x = 121;
        
        boolean result = isPalindrome(x);
        
        if (result) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
    }
}
