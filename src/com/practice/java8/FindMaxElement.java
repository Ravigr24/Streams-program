package com.practice.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxElement {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 16, 15, 25);

        int max = myList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);



        /* when number is in Array */

        int[] arr = {10, 15, 8, 49, 25, 98, 32, 16, 15, 25};

        int maxData = Arrays.stream(arr).boxed()
                .max(Comparator.naturalOrder()).get();

        System.out.println(maxData);

    }
}
