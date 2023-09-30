package com.awsravi.HRank;
import java.util.stream.IntStream;

public class PalindromeNumCheckJava8 {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        return IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
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
