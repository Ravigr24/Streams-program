package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstElement {
    public static void main(String args[]){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,16,15,25);
        int n=2;
        myList.stream()
                .sorted()
                .skip(n-1)
                .findFirst()
                .ifPresent(System.out::println);

        int[] arr ={10,15,8,49,25,98,32,16,15,25};

        List<Integer> list = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        list.stream().skip(n-1).findFirst().ifPresent(System.out::println);
    }
}
