package com.java.datastructure.sort;

/*
    * Complexity O(n^2)
    *
    */
class BubbleSort {
    public static int [] intArr = {23,14,5,-5,10,0,-22,5};
    public static void main(String[] args) {

        for(int lastSortedIndex=intArr.length-1; lastSortedIndex>0;lastSortedIndex--){
            for (int i= 0;i<lastSortedIndex;i++){
            if(intArr[i]>intArr[i+1]) {
                swap(i,i+1);
            }
            }
        }
        for (int i: intArr){
            System.out.println(i);
        }
     }
      static void swap(int i, int j){
        if (i==j)
            return;
         int temp=intArr[i];
         intArr[i]= intArr[j];
         intArr[j]= temp;
     }
}