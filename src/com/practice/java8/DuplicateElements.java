package com.practice.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String args[]){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,16,15,25);
        Set<Integer> set = new HashSet<>();
        myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);

        System.out.println("print elements without duplicates");

        getDupicates();
        System.out.println(" to print the duplicate numbers");

        /*  when number are array int[]  arr = {10,15,8,49,25,98,32);
         */
        int[]  arr = {10,15,8,49,25,98,32,16,15,25};
        Set<Integer> set1 = new HashSet<>();
        List<Integer> list = Arrays.stream(arr).boxed()
             /*   .distinct()   this for direct way */
                .filter(n -> !set1.add(n))
                .collect(Collectors.toList());
        System.out.println(list);
    }
    public static void getDupicates(){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,16,15,25);
        myList.stream().distinct().forEach(noDuplicates -> System.out.println(noDuplicates));
    }
}
