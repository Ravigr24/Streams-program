package com.example.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class HR {

    public static void main(String[] args) {
        String filepath = "SampleFile.txt";
        try{
            List<String> specialCharWords = new ArrayList<>();

            String longestWord = "";
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line ;

            Pattern wordPattern = Pattern.compile("\\s.,:!?()]+");

            while((line = reader.readLine()) != null){
                String[] words = wordPattern.split(line);
                for(String word : words){
                    if(word.matches(".*[^a-zA-Z0-9].*")){
                        specialCharWords.add(word);
                    }

                    if(word.length()> longestWord.length()){
                        longestWord = word;
                    }
                }
            } reader.close();
            System.out.println("Words with special characters: " + specialCharWords);
            System.out.println("Longest word: " + longestWord);


        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
