package com.java.datastructure.sort;

/*
 * Complexity O(n^2)
 *
 */
class InsertionSort {
    public static int [] intArr = {23,14,5,-5,10,0,-22,5};
    public static void main(String[] args) {

        for (int firstSortedIndex = 1; firstSortedIndex < intArr.length; firstSortedIndex++) {
            int newElement=intArr[firstSortedIndex];
            int i;
            for (i = firstSortedIndex; i>0 && intArr[i-1]>newElement;i--){
                intArr[i]=intArr[i-1];// First loop {23,23,5,-5,10,0,-22,5}
                                     // second loop {14,23,23,-5,10,0,-22,5}
                                    // second loop {14,14,23,-5,10,0,-22,5}
            }
            intArr[i]= newElement;//{14,23,5,-5,10,0,-22,5}
                                //{14,5,23,-5,10,0,-22,5}
                                //{5,14,23,-5,10,0,-22,5}
        }
        for (int i : intArr) {
            System.out.println(i);
        }
    }
}