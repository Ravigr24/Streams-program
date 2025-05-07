package com.example.test;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagSequence {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for(int cs = 1; cs <= test_cases; cs++){
            int n = kb.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = kb.nextInt();
            }
            findZigZagSequence(a, n);
        }
    }

    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid;
        if(n%2==0){
            mid = (n + 1)/2;
        }else{
            mid = n/2;
        }
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid+1;
        int ed = n - 1;
        while(st <= ed){
            temp = a[ed];
            a[ed] = a[st];
            a[st] = temp;
            st++;
            ed--;

        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
