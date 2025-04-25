package com.example.test;

import java.util.Arrays;
import java.util.Comparator;

public class ArrowShoot {
    public static void main(String[] args) {
        //int[][] point = {{10,16},{2,8},{1,6},{7,12}};

        //int[][] point = {{1,2},{3,4},{5,6},{7,8}};

        int[][] point = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};

        int a = findArrows(point);
        System.out.println(a);

    }

    public static int  findArrows(int[][] point){

        if (point.length == 0) {
            return 0;
        }

        Arrays.sort(point, Comparator.comparingInt(a -> a[1]));

        int arrow = 1;
        int currentEnd = point[0][1];

        for (int i = 1; i < point.length; i++) {
            int start = point[i][0];
            int end = point[i][1];

            if (start > currentEnd) {
                arrow++;
                currentEnd = end;
            }
        }

        return arrow;
    }
}
