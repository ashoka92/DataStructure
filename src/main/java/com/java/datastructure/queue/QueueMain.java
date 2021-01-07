package com.java.datastructure.queue;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueueUsingArray<String> queue =new CustomQueueUsingArray<>(String.class,10);
        queue.enqueue("Asaa");
        queue.enqueue("basa");
        queue.enqueue("bsdad");
        queue.enqueue("dAsaa");
        queue.enqueue("eAsaa");
        queue.enqueue("fAsaa");
       String dequeue= queue.dequeue();

        String[] queueArray= queue.getQueue();
        for(String s :queueArray)
            System.out.println(s);
    }
}
