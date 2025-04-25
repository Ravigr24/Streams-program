package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetSum {
    public static void main(String[] args) {

        TargetSum solution = new TargetSum();

        // Test case
        int[] nums = {1,2,3,4, 5,6, 7, 9};
        int target = 8;
        List<int[]> pairs = solution.findPairs(nums, target);

        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }

    public   List<int []>  findPairs(int[] nums, int  target){
        List<int []> list = new ArrayList<>();
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                list.add(new int[]{nums[left], nums[right]});
                left++;
                right--;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }

        return list;
    }
}
