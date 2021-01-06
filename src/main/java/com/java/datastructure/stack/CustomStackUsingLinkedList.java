package com.java.datastructure.stack;

import com.java.datastructure.linkedList.SinglyLinkList;

import java.lang.reflect.Array;

public class CustomStackUsingLinkedList<T> {

    private Node top;
    public T pop(){
        Node removeTop = top;
        if(removeTop != null){
            top=removeTop.next;
        }
        return removeTop.t;
    }
    public T push(T t){
        Node newNode = new Node(t);
        if (this.top != null) {
            newNode.next = top;
        }
        top=newNode;
        return top.t;
    }

    public void getStackArray() {
        Node node = top;
        System.out.print("[ ");
        while (node !=null){
            System.out.print(node.t+", ");
            node= node.next;
        }
        System.out.print("]");
    }

    class Node{
        T t;
        Node next;
        public Node(T t){
            this.t=t;
            this.next=null;
        }
    }
}
