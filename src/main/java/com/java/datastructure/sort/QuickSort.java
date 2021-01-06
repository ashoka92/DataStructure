package com.java.datastructure.sort;

/*
 * Complexity O(n^2)
 *
 */
class QuickSort {
    public static int [] intArr = {23,14,5,-5,10,0,-22};
    public static void main(String[] args) {
        quickSort(intArr,0,intArr.length);
        for (int i :intArr)
        System.out.println(i);
    }

    public static void quickSort(int [] input, int start, int end){
        if(end-start < 2 )
            return;

        int pivotIndex = partition(input,start,end);
        quickSort(input,start,pivotIndex);
        quickSort(input,pivotIndex+1,end);

    }

    private static int partition(int[] input, int start,int end) {
        int pivot= input[start];
        int i=start;
        int j=end;
        while(i<j) {
            while (i < j && input[--j] > pivot);
            if(i<j)
                input[i]=input[j];
            while(i<j && input[++i] < pivot)
                if(i<j)
                    input[j]=input[i];
        }
        input[j]=pivot;
        return j;
    }
}