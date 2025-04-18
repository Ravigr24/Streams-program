package com.example.test;

public class MaxSubstring {
    public static String maxSubstring(String s) {
        String maxSub = ""; // Initialize the maximum substring as an empty string

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Generate all substrings starting at index i
            for (int j = i + 1; j <= s.length(); j++) {
                String currentSub = s.substring(i, j);
                // Compare the current substring with the maximum substring found so far
                if (currentSub.compareTo(maxSub) > 0) {
                    maxSub = currentSub;
                }
            }
        }

        return maxSub;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(maxSubstring("banana")); // Expected output: "nana"
        System.out.println(maxSubstring("aaa"));   // Expected output: "aaa"
        System.out.println(maxSubstring("baca"));  // Expected output: "ca"
    }
}