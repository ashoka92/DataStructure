package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class StringOccurrence {
    public static void main(String[] args) {
       int count= countSubsetOccurrenceIgnoreUpperAndLower("AbcfekrtkkkabcjdjAbc","abc");
       System.out.println(count);
       System.out.println(countAllCharOccurrence("asAshokj"));
    }

    static int countSubsetOccurrenceIgnoreUpperAndLower(String set, String subset){
        int count=0;
        int fromIndex=0;
        while ((fromIndex = set.toLowerCase().indexOf(subset.toLowerCase(), fromIndex)) != -1 ){
           count++;
           fromIndex++;
        }
        return count;
    }

    static   Map<Character, Integer> countAllCharOccurrence(String value){
        Map<Character, Integer> map= new HashMap<>();
        Character [] characters= new Character[value.length()];
        char [] charArray=value.toCharArray();
        for(char c:charArray){
            int i=0;
            if(map.get(c) ==null && c!='\0' )
                map.put(c,i+1);
            else
                map.put(c,map.get(c)+1);
        }
        return map;
    }

}
