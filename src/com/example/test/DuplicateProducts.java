package com.example.test;

import java.util.HashMap;

public class DuplicateProducts {
    public static int numDuplicates(String[] name, int[] price, int[] weight) {

        HashMap<String, Integer> productCountMap = new HashMap<>();


        for (int i = 0; i < name.length; i++) {
            String key = name[i] + "," + price[i] + "," + weight[i];

            productCountMap.put(key, productCountMap.getOrDefault(key, 0) + 1);
        }

        int duplicateCount = 0;
        for (int count : productCountMap.values()) {
            if (count > 1) {
                duplicateCount += (count - 1); // Subtract 1 to count duplicates only
            }
        }

        return duplicateCount;
    }

    public static void main(String[] args) {
        // Example input
        String[] name = {"ball", "bat", "glove", "glove", "glove"};
        int[] price = {2, 3, 1, 2, 1};
        int[] weight = {2, 5, 1, 1, 1};

        // Call the function and print the result
        System.out.println(numDuplicates(name, price, weight)); // Expected output: 1
    }
}