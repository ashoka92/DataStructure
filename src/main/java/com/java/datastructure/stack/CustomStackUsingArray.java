package com.java.datastructure.stack;

import java.lang.reflect.Array;

public class CustomStackUsingArray<T> {
    private T stackArray[] ;
    private int top;
    private Class<T> clazz;

    public CustomStackUsingArray(Class<T> clazz, int capacity) throws ClassCastException {
        this.stackArray = (T[])Array.newInstance(clazz, capacity);
        this.clazz = clazz;
    }

    public T pop(){
        T element=stackArray[top];
        stackArray[top]=null;
        top--;
        return element;
    }
    public int push(T t){
       if (this.stackArray[0]==null ){
           this.stackArray[0]= t;
           this.top++;
       }else {
          this.stackArray[top++]=t;
       }
        return top;
    }

    public T[] getStackArray() {
        if(this.top==0)
            System.out.println("Stack is empty");
        T[] topArray= (T[])Array.newInstance(clazz,top) ;
        for (int i=0; i<top; i++){
            topArray[i]=stackArray[i];
        }
        return topArray;
    }
}
