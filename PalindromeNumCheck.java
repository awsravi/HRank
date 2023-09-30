package com.awsravi.HRank;

public class PalindromeNumCheck {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        
        return str.equals(new StringBuilder(str).reverse().toString());
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
