package com.practice.java8;

import java.util.*;
import java.util.stream.Collectors;

public class NonRepeatedLetters {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        repeate(input);
    }

    public static void repeate(String s){
        String input = s.toLowerCase();

        System.out.println("For all occerances of letters");
        Map<Character, Long> charCount = input.chars().filter(c -> c != ' ')
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c,  LinkedHashMap::new, Collectors.counting()));
        System.out.println(charCount);

        // for all non repeating letters
        System.out.println("For all occerances of letters only once ");
        charCount.entrySet().stream()
                .filter(entry -> entry.getValue() ==1)
                .forEach(System.out::println);

        System.out.println("For first or nth occerances of letters");
        int n = 1;
        System.out.println( charCount.entrySet().stream()
                .filter(entry -> entry.getValue() ==1)
                .skip(n-1)
                .findFirst()
                .get());

        System.out.println("For first or nth non repeating of letters");
        int a = 1;
        System.out.println( charCount.entrySet().stream()
                .filter(entry -> entry.getValue() >1)
                .skip(a-1)
                .findFirst()
                .get());

        System.out.println("For all occerances of letters more than once ");

        charCount.entrySet().stream().filter(entry -> entry.getValue()>1)
                .forEach(System.out::println);

    }

}
