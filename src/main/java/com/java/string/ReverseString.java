package com.java.string;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ReverseString {
    public static void main(String[] args) {
       System.out.println(reverseStringCharArray("Ashd6lkgjdjkkdkdhhskekskkdkk dkdkkkd kdkdskdka"));
       System.out.println(reverseStringCharSwappingTemp("Ashd7lkgjsdjskdkdhhshskskkdkk dkdhdkd kdhdkkdka"));
       System.out.println(reverseWithoutCharArrayLibrary("Ashd6lkgjdjkkdkdhhskekskkdkk dkdkkkd kdkdskdka"));
       char[]  arr=reverseCharUsingRecursive(new char[]{'A', 's', 'h', 'o', 'k'},0,4);
       for (char c : arr)
           System.out.print(c);

       System.out.println();
        System.out.println(reverseStringUsingRecursive("Ashok"));

    }
/*
* time complexity O(n) space O(n)
* */
    static String reverseStringCharArray(String actual){
        LocalTime startTime = LocalTime.now();
        char [] array =new char[actual.length()];
        char [] actualChar = actual.toCharArray();
        int j=0;
        for(int i=actual.length()-1 ; i>=0 ;i--){
            array[i] =actualChar[j];
            j++;
        }
        LocalTime endTime = LocalTime.now();
        System.out.println(endTime.getNano()-startTime.getNano());
         return String.valueOf(array);
    }
    /*
     * time complexity O(n/2) space O(1)
     * */

    static  String reverseStringCharSwappingTemp(String actual){
        LocalTime startTime = LocalTime.now();
        char [] actualChar = actual.toCharArray();
        int j=actual.length()-1;
        for(int i=0;i<actual.length()/2;i++){
            char temp ='\0';
            temp=actualChar[i];
            actualChar[i]=actualChar[j];
            actualChar[j]=temp;
            j--;
        }
        LocalTime endTime = LocalTime.now();
        System.out.println(endTime.getNano()-startTime.getNano());
        return String.valueOf(actualChar);
    }
    static  String reverseWithoutCharArrayLibrary(String actual){
        StringBuilder builder = new StringBuilder();
        for(int i=actual.length()-1; i>=0 ;i--){
            builder.append(actual.charAt(i));
        }
        return builder.toString();
    }

    static char[] reverseCharUsingRecursive(char[] actual, int i , int j ){
        if (i < j)
        {
            char ch = actual[i];
            actual[i] = actual[j];
            actual[j] = ch;
            reverseCharUsingRecursive(actual, i + 1, j - 1);
        }
        return actual;
    }

    static String reverseStringUsingRecursive(String actual){

        if (actual == null || actual.equals(""))
            return actual;

        // last character + recur for remaining string
        return actual.charAt(actual.length() - 1) +
                reverseStringUsingRecursive(actual.substring(0, actual.length() - 1));

    }


}
