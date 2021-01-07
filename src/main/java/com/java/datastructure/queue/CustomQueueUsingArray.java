package com.java.datastructure.queue;

import java.lang.reflect.Array;

public class CustomQueueUsingArray<T> {
    private int front;
    private int rear;
    private T queueArray[];
    private Class<T> clazz;

    public CustomQueueUsingArray(Class<T> clazz, int capacity) {
        this.queueArray= (T[]) Array.newInstance(clazz,capacity);
        this.clazz=clazz;
    }

    public T enqueue(T t){
        return null;
    }
    public T dequeue(){
        return null;
    }

}
