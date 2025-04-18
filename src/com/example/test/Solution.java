package com.example.test;

import java.util.Scanner;

public class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {

            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return rev;

    }



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String s = sc.nextLine();
        System.out.println(s);
        Solution sol = new Solution();
        int res = sol.reverse(x);
        System.out.println(res);

    }
}


