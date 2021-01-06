package com.java.datastructure.linkedList;

public class SinglyLinkList<T>{
    private Node head;
    public Node tail;
    private int length;
    public boolean addElement(T t){
        Node newNode = new Node(t);
            if(this.head==null){
                this.head = newNode;
                this.tail = newNode;
            }else{
                this.tail.next = newNode;
                this.tail = newNode;
            }
           return true;
       }
       public Node getAllElement(){

           Node allNode =this.head;
           if(allNode.next == null) {
               System.out.println("List is empty");
               return this.head;
           }else {
               System.out.println();
               System.out.print("[ ");
               while (allNode != null) {
                   System.out.print(allNode.t + ",");
                   allNode=allNode.next;
                   length++;
               }
               System.out.print("]");
           }
           return this.head;
       }

    public int getLength() {
        return length;
    }

    public SinglyLinkList<T> reverseNode(SinglyLinkList<T> linkList){
        Node currentNode = linkList.head;
        Node previousNode = null;
        Node nextNode =null;
        while (currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode=currentNode;
            currentNode = nextNode;
        }
        linkList.head =previousNode;
        return linkList;

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


