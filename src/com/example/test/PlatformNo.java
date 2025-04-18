package com.example.test;

import java.util.*;
public class PlatformNo {


    public static void main(String[] args) {

        int[][] trainTimings = new int[][]{{600,700},{630,820},{1200,1500}};
        // int[][] trainTimings = new int[][]{{0030,0120},{0600, 0700},{1200,1500}};
        //expected answer is : 2

        int numPlatformsRequired = getNumPlatformsRequired(trainTimings);
        System.out.println("Number of platforms required at the train station is/are : " + numPlatformsRequired);
    }

    static int getNumPlatformsRequired(int[][] trainTimings){
        int n = trainTimings.length;
        int[] arrival = new int[n];
        int[] departure = new int[n];
        for(int i = 0;i<n; i++){
            arrival[i] = trainTimings[i][0];
            departure[i] = trainTimings[i][1];
        }
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platform = 0;
        int maxPlatform = 0;
        int i = 0, j = 0;

        while(i < n && j < n){
            if(arrival[i] <= departure[j]){
                platform++;
                maxPlatform = Math.max(maxPlatform, platform);
                i++;
            }else{
                platform--;
                j++;
            }
        }

        return maxPlatform;
    }
}