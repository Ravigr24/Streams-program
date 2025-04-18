package com.example.test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConcateIntegers {
    public static void main(String[] args) {
        int a = 5;
        int x = 200, y = 2000;
        int [] arr = {5,15,25,35,45};
        System.out.println(concat(a,x,y,arr));
    }
    public static int concat(int a, int x, int y, int[] arr){

        //with Streams API
        Set<Integer> s = new HashSet<>(
                IntStream.range(0, a)
                        .boxed()
                        .flatMap(i -> IntStream.range(0, a)
                                .mapToObj(j -> Integer.parseInt(arr[i] + "" + arr[j])))
                        .filter(res -> res > x && res < y)
                        .collect(Collectors.toSet())
        );
        return s.size();


       /* //with direct approach

        Set<Integer> s = new HashSet<>();

        for(int i = 0;i<a;i++ ){
            for(int j = 0; j<a;j++ ){
                int res = Integer.parseInt(arr[i]+""+arr[j]);

                if(x<res && res<y){
                    s.add(res);
                }
            }
        }
        return s.size();

        */
    }
}
