package com.java.datastructure.sort;

/*
 * Complexity O(n^2)
 *
 */
class SelectionSort {
    public static int [] intArr = {23,14,5,-5,10,0,-22,5};
    public static void main(String[] args) {

        for(int lastSortedIndex=intArr.length-1; lastSortedIndex >0;lastSortedIndex--){
            int largest =0;
            for (int i= 1; i<=lastSortedIndex; i++){
            if(intArr[i] > intArr[largest]) {
               largest=i;
            }
            }
            swap(largest,lastSortedIndex);
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