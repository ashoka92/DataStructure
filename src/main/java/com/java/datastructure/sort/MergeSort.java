package com.java.datastructure.sort;

/*
 * Complexity O(n^2)
 *
 */
class MergeSort {
    public static int [] intArr = {23,14,5,-5,10,0,-22,5};
    public static void main(String[] args) {
        mergeSort(intArr,0,intArr.length);
        for (int i :intArr)
        System.out.println(i);
    }

    public static void mergeSort(int [] input, int start, int end){
        if(end-start < 2 )
            return;

        int mid = (start+end )/2;
        mergeSort(input,start,mid);
        mergeSort(input,mid,end);
        mergeArray(input,start,mid,end);
    }

    private static void mergeArray(int[] input, int start, int mid, int end) {

        if(input[mid-1] <= input[mid])
            return;
        // i for left and j for right array
        int i=start;
        int j= mid;
        int tempIndex=0;

        int [] tempArray = new int[end-start];

        while(i<mid && j<end){
            tempArray[tempIndex++]= input[i] <= input[j] ? input[i++]:input[j++];
        }
        System.arraycopy(input,i,input,start+tempIndex,mid-i);
        System.arraycopy(tempArray,0,input,start,tempIndex);
    }
}