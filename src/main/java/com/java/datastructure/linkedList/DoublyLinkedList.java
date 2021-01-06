package com.java.datastructure.linkedList;

public class DoublyLinkedList<T> {

    private Node head;
    private Node tail;
    private int length;

    public int getLength() {
        return length;
    }

    public boolean addElementAtHead(T t){
        Node newNode = new Node(t);
        if(this.head==null){
            this.head=newNode;
            this.tail=newNode;
            newNode.prev=null;
            newNode.next=null;
        }else {
            newNode.next=head;
            this.head.prev=newNode;
            newNode.prev=null;
            this.head=newNode;
        }
        return true;
    }
    public boolean addElementAtEnd(T t){
        Node newTailNode = new Node(t);
        if(this.tail == null){
            this.head=newTailNode;
            this.tail=newTailNode;
            newTailNode.prev=null;
        }else {
            tail.next=newTailNode;
            newTailNode.prev=tail;
        }
        newTailNode.next=null;
        return true;
    }
    public boolean addElementAfter(T t,T v){
        Node newNode= new Node(v);
        Node allNode = this.head;
        while (allNode !=null){
               if(allNode.t == t || allNode.t.equals(t)){
                   newNode.prev = allNode;
                   newNode.next =allNode.next;
                   allNode.next=newNode;
               }
               allNode =allNode.next;
        }
        return true;
    }

    public  Node getAllElementLeftToRight(){
        Node allNode =this.head;
        if(allNode == null){
            System.out.println("Doubly Linked list is empty");
            return this.head;
        }else {
            System.out.print("[ ");
            while (allNode !=null){
                System.out.print(allNode.t+", ");
                allNode =allNode.next;
                length++;
            }
            System.out.print(" ]");
        }
        return this.head;
    }

    public  Node getAllElementRightToLeft(){
        Node allNode =this.tail;
        if(allNode == null){
            System.out.println("Doubly Linked list is empty");
            return this.head;
        }else {
            System.out.print("[ ");
            while (allNode !=null){
                System.out.print(allNode.t+", ");
                allNode =allNode.prev;
                length++;
            }
            System.out.print(" ]");
        }
        return this.tail;
    }

    public class Node{
        T t;
        Node next;
        Node prev;

        public Node(T t) {
            this.t = t;
        }
    }
}