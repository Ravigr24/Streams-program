package com.example.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingletonClass {

    private static SingletonClass instance;

    private  SingletonClass(){}

    public static SingletonClass getInstance(){
        if(instance == null){
            instance =  new SingletonClass();
        }
        return instance;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();

            if("x".equals(entry.getKey())){
                iterator.remove();
            }
        }
    }
}

