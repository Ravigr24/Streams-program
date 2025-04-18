package com.example.test;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringRepete {
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        //String str = sc.nextLine();
//        String str = "Hello world hello Java world Java";
//        String copy = str.toLowerCase();
//
//        int[] count = new int[26];
//
//        for (char c : copy.toCharArray()) {
//            if (c >= 'a' && c <= 'z') {
//                count[c - 'a']++;
//            }
//        }
//        for (int i = 0; i < count.length; i++) {
//            if (count[i] > 0) {
//                char letter = (char) ('a' + i);
//                System.out.println(letter + "-" + count[i]);
//            }
//        }

        String input = "Hello world hello Java world Java  112" +
                "";
        StringRepete sr = new StringRepete();
        sr.repete(input);
    }

    public void repete(String str){


        // Convert the string to lowercase (optional, for case-insensitive counting)
        String input = str.toLowerCase();

        // Split the string into words and count occurrences using Streams
        Map<String, Long> wordCounts = Arrays.stream(input.split("\\s+")) // Split by whitespace
                .collect(Collectors.groupingBy(
                        word -> word, // Group by the word itself
                        Collectors.counting() // Count occurrences
                ));

        //  For letters
        Map<Character, Long> charCounts = input.chars()
                .filter(c -> c != ' ')
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting() ));

        charCounts.forEach((character, count) -> System.out.println(character + "-" + count));

        // Print the result
        wordCounts.forEach((word, count) -> System.out.println(word + " - " + count));
    }

}
