package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StaringWith1 {
     public static void main(String args[]){
         List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,16);
         myList.stream()
                 .map(s -> s + "")
                 .filter(s ->s.startsWith("1"))
                 .forEach(System.out::println);

         /*  when number are array int[]  arr = {10,15,8,49,25,98,32);
          */
         int[]  arr = {10,15,8,49,25,98,32,16};

         List<String> list = Arrays.stream(arr).boxed()
                 .map(s -> s + "")
                 .filter(s ->s.startsWith("1"))
                 .collect(Collectors.toList());

         System.out.println(list);
     }
}
