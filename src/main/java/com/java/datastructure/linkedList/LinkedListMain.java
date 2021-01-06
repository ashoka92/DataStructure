package com.java.datastructure.linkedList;

public class LinkedListMain {
    public static void main(String[] args) {
     SinglyLinkList<String> nameList= new SinglyLinkList<>();
        nameList.addElement("Anita");
        nameList.addElement("Amit");
        nameList.addElement("Any");
        nameList.addElement("Bunny");
        nameList.getAllElement();

        SinglyLinkList reverseLinkedList = nameList.reverseNode(nameList);
        reverseLinkedList.getAllElement();

        SinglyLinkList<Integer> ageList= new SinglyLinkList<>();
        ageList.addElement(10);
        ageList.addElement(20);
        ageList.addElement(30);
        ageList.addElement(40);
        ageList.getAllElement();

        SinglyLinkList reverseLinkList= ageList.reverseNode(ageList);
        reverseLinkList.getAllElement();

       DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.getAllElementLeftToRight();
        doublyLinkedList.getAllElementRightToLeft();
        doublyLinkedList.addElementAtHead(15);
        doublyLinkedList.addElementAtHead(25);
        doublyLinkedList.addElementAtHead(35);
        doublyLinkedList.addElementAtHead(45);
        doublyLinkedList.addElementAtHead(55);
        doublyLinkedList.getAllElementLeftToRight();
        doublyLinkedList.getAllElementRightToLeft();

        doublyLinkedList.addElementAtEnd(100);
        doublyLinkedList.getAllElementLeftToRight();

        doublyLinkedList.addElementAfter(35,40);
        doublyLinkedList.getAllElementLeftToRight();




    }
}
