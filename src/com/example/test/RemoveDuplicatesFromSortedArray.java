package com.example.test;

/******************************************************************************

 Given a sorted array arr[] of size N, the task is to remove the duplicate elements from the array.

 Examples:

 Input: arr[] = {2, 2}
 Output: arr[] = {2,null}
 Explanation: All the elements are 2, So only keep one instance of 2.

 Input: arr[] = {1, 2, 2, 3, 4, 4 }
 Output: arr[] = {1, 2, 3, 4,null,null}

 *******************************************************************************/
import java.util.*;
public class RemoveDuplicatesFromSortedArray
{
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int n = arr.length;

        // removeDuplicates() returns new size of array
        n = removeDuplicates(arr, n);

        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    static int removeDuplicates(int arr[], int n) {

//        Set<Integer> vaules = new HashSet<>();
//
//        List<Integer> unique = new ArrayList<>();
//
//        for(int i =0;i<n;i++){
//            if(!vaules.contains(arr[i])){
//                vaules.add(arr[i]);
//                unique.add(arr[i]);
//            }
//        }
//
//        for(int i =0;i<n;i++){
//            if(i<unique.size()){
//                arr[i]= unique.get(i);
//            }else{
//                arr[i] = 0;
//            }
//        }
//
//        return arr.length;



        int index = 0;
        for(int i =1 ;i<arr.length;i++){
            if(arr[index]!=arr[i]) {
                index++;
                arr[index] = arr[i];
            }
        }
        while(index+1<arr.length){
            index++;
            arr[index] = 0;
        }
        return arr.length;


        //To present minum two repeteation

//        int index = 2;
//        for (int i = 2; i < arr.length; i++) {
//            if (arr[i] != arr[index - 2]) {
//                arr[index] = arr[i];
//                index++;
//            }
//        }
//        while(index<arr.length){
//            arr[index] = 0;
//            index++;
//        }
//        return arr.length;


    }


}
