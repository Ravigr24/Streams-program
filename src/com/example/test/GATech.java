package com.example.test;

import java.util.Scanner;

public class GATech {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,7,11,15};
        int target = 9;

     int [] res =  TwoSum(arr,target);
     for(int i= 0;i<res.length;i++){
         System.out.print(res[i] + " ");
     }
    }

    public static int[] TwoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
