package com.java.concurency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

public class ReadAnDWriteFieldVisibility implements Runnable {
    AtomicInteger x= new AtomicInteger(0);

    public synchronized AtomicInteger readValue(){
        System.out.println("Read X value "+x+" Thread "+Thread.currentThread().getName()+" Id"+Thread.currentThread().getId());
        return x;
    }
    public synchronized void writeValue(){
        System.out.println("Write X value "+x+" Thread "+Thread.currentThread().getName()+" Id"+Thread.currentThread().getId());
        x.getAndAdd(1);
    }

     @Override
    public void run() {
        while (x.getAndDecrement()==0){
            readValue();
            writeValue();

        }

    }
    /*
    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return true;
    }

    @Override
    public Object get() throws InterruptedException, ExecutionException {
        return x;
    }

    @Override
    public Object get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return x;
    }*/
}
