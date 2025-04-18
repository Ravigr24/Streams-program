package com.example.test;

import java.util.*;
import java.util.stream.Collectors;

// shift first two element of list to last , input = [1,2,3,4,5]   o/p should be = [3,4,5,1,2]

public class Altimet {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//
//        int first = list.get(0);
//        int second = list.get(1);
//
//        list.remove(0);
//        list.remove(0);
//
//        list.add(first);
//        list.add(second);
//        System.out.println(list);
//    }

//Create a java stream program to find the sum of the salaries of each department
    public static void main(String [] args){

        List<String> list= new ArrayList<>() ;
        list.add("Ram");
        list.add("Jim");
        list.add("Sita");
        list.add("Elyse") ;

        for(String str: list) {
            if(str.equals("Ram"))
                list.remove("Ram");
        }
        System.out.println(list.toString());

    }

}