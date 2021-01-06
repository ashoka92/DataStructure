package com.java.concurency;

import javafx.concurrent.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    static  Future<java.lang.Integer []> array;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       /* ReadAnDWriteFieldVisibility visibility = new ReadAnDWriteFieldVisibility();
      *//*for (int i=0;i<10;i++){
          new Thread(()->{
              visibility.readValue();
              visibility.writeValue();
          }).start();
      }*//*
        ExecutorService executor= Executors.newFixedThreadPool(10);
        for (int i=0;i<20;i++) {
            Future<ReadAnDWriteFieldVisibility> submit = executor.submit(ReadAnDWriteFieldVisibility::new);
            System.out.println(submit.get().readValue());
        }*/
        int[] intArrayEven= new int[10];
        int[] intArrayFive= new int[10];
        int[] intArrayOdd= new int[10];
         for(int i=0; i<10 ;i++){
            if(i%2 == 0) {
                intArrayEven[i] = i-10 ;
            }
            else if(i%5 ==0){
                intArrayFive[i] = i-10 ;
            }else {
                intArrayOdd[i] = i-10 ;
            }
        }
         /*for(int i:intArrayEven)
            System.out.println(i);
        System.out.println("===================");

        for(int i:intArrayFive)
            System.out.println(i);
        System.out.println("===================");
        for(int i:intArrayOdd)
            System.out.println(i);
        System.out.println("===================");
*/

        BubbleSort bubbleSort = new BubbleSort();
      /* int[] even = bubbleSort.bubbleSort(intArrayEven);
        int[] odd = bubbleSort.bubbleSort(intArrayOdd);
        int[] five = bubbleSort.bubbleSort(intArrayFive);
*/
        List task = new ArrayList();


        Callable task1 = ()-> {
           return bubbleSort.bubbleSort(intArrayEven);
        };

        Callable task2 = ()->{
            return bubbleSort.bubbleSort(intArrayFive);
        };

        Callable task3 = ()->{
            return bubbleSort.bubbleSort(intArrayOdd);
        };

        task.add(task1);
        task.add(task2);
        task.add(task3);


        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future<Object>> futures = null;
        try{
           futures = service.invokeAll(task);

        }catch (Exception e){
            e.printStackTrace();
            service.shutdownNow();
        }finally {
            service.shutdown();
        }
        for(Future<Object> obj :futures){
            int[] arr = (int []) obj.get() ;
            for (int i : arr)
                System.out.println(i);
            System.out.println("=================================================");

        }

    }


}
