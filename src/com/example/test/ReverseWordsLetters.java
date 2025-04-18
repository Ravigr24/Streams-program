package com.example.test;

public class ReverseWordsLetters {
    public static void main(String[] args) {
        String example = "Hello world this is Java";
        String reversed = reverseWords(example);
        //String reversedLetters  = reverseWordsLetter(example);
        System.out.println(reversed);
    }

    public static String reverseWords(String sentence) {
        String [] words = sentence.split("\\s+");

        int left = 0;
        int right = words.length-1;
        while(left<right){
            String temp = words[left];
            words[left]= words[right];
            words[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", words);
    }

}
