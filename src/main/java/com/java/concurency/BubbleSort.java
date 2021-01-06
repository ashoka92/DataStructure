package com.java.concurency;

/*
    * Complexity O(n^2)
    *
    */
public class BubbleSort {

    public  int[]  bubbleSort(int [] intArr) {
        for (int lastSortedIndex = intArr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
            for (int i = 0; i < lastSortedIndex; i++) {
                if (intArr[i] > intArr[i + 1]) {
                    swap(i, i + 1,intArr);
                }
            }
        return intArr;
    }

    private void swap(int i, int j,int[] intArr){
        if (i==j)
            return;
         int temp=intArr[i];
         intArr[i]= intArr[j];
         intArr[j]= temp;
     }
}