package com.java.datastructure.queue;

import java.lang.reflect.Array;
import java.util.Queue;

public class CustomQueueUsingArray<T> {
    private int front;
    private int rear;
    private T queueArray[];
    private Class<T> clazz;
    private int capacity;

    public CustomQueueUsingArray(Class<T> clazz, int capacity) {
        this.queueArray= (T[]) Array.newInstance(clazz,capacity);
        this.clazz=clazz;
        this.capacity=capacity;
    }

    public T enqueue(T t){
        if(this.front==this.rear && rear<capacity){
            queueArray[this.front]=t;
        }else {
            queueArray[this.rear] = t;
        }
        this.rear++;
        return queueArray[this.rear];
    }
    public T dequeue(){
        T frontValue=queueArray[this.front];
        if(this.front==this.rear)
            System.out.println("Queue is empty");
        else {
            for(int i=0; i<rear-1;i++)
                queueArray[i]=queueArray[i+1];
            rear=rear--;
        }
        return frontValue;
    }
    public T[] getQueue(){
        if (front==rear)
            System.out.println("Queue is empty");
        T[] rearQueueArray= (T[])Array.newInstance(clazz,rear) ;
        for (int i=0; i<rear; i++){
            rearQueueArray[i]=queueArray[i];
        }
        return rearQueueArray;
    }

}
