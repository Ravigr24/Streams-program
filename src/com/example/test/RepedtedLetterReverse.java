package com.example.test;

import java.util.Map;
import java.util.stream.Collectors;

public class RepedtedLetterReverse {
    public static void main(String[] args) {

        String str = "Ravikiran G R";
        str = str.toLowerCase();
        if(str == null || str.length()==0){
            System.out.println("null");
        }

        Map<Character, Long> map = str.chars().filter(c -> c!= ' ')
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c,Collectors.counting()));

        System.out.println(map);

        System.out.println(map.entrySet().stream().filter(entry -> entry.getValue()>1)
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .skip(1)
                .findFirst()
                .get());

    }
}

