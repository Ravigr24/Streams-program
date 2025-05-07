package com.example.test;

public class MaxSumSubArray {

//Problem Statement #
//Given an array of positive numbers and a positive number ‘k,’
//find the maximum sum of any contiguous subarray of size ‘k’.
//Example 1:
//Input: [2, 1, 5, 1, 3, 2], k=3
//Output: 9
//Explanation: Subarray with maximum sum is [5, 1, 3].
//Example 2:
//Input: [2, 3, 4, 1, 5], k=2
//Output: 7
//Explanation: Subarray with maximum sum is [3, 4].

    public static void main(String[] args) {
        int[] Input1 = {2, 1, 5, 1, 3, 2};
        int k1=3;
        int[] Input2= {2, 3, 4, 1, 5};
        int k2=2;

        System.out.println(maxSum(Input1, k1));
        System.out.println(maxSum(Input2, k2));
    }
    public static int maxSum(int[] input, int k) {
        if(input.length<k){
            return -1;
        }
        int max_Sum = 0;
        int currentSum =0;

        for(int i=0 ;i<k;i++){
            currentSum += input[i];
        }
        max_Sum = currentSum;

        for(int i = k ;i<input.length;i++){
            currentSum += input[i] - input[i-k];
            max_Sum =Math.max(max_Sum, currentSum);
        }

        return max_Sum;
    }
}
