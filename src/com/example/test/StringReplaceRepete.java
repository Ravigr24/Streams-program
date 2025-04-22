package com.example.test;



public class StringReplaceRepete {
    public static void main(String[] args) {
        StringReplaceRepete sr = new StringReplaceRepete();

        String input = "tomorrow";
        String output = sr.replaceRepete(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);

    }

    public String replaceRepete(String str){

        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'o') {
                result.append("$".repeat(count));
                count++;
            } else {
                result.append(c);

            }
        }

        return result.toString();
    }
}
