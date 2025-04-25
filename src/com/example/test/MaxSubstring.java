package com.example.test;

public class MaxSubstring {
    public static String maxSubstring(String s) {
        String maxSub = "";


        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {
                String currentSub = s.substring(i, j);

                if (currentSub.compareTo(maxSub) > 0) {
                    maxSub = currentSub;
                }
            }
        }

        return maxSub;
    }

    public static void main(String[] args) {

        System.out.println(maxSubstring("banana"));
        System.out.println(maxSubstring("aaa"));
        System.out.println(maxSubstring("baca"));
    }
}