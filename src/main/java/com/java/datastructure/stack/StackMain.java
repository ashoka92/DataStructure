package com.java.datastructure.stack;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        CustomStackUsingArray<String> stackArray = new CustomStackUsingArray(String.class,20);
        stackArray.push("asgok");
        stackArray.push("BADS");
        stackArray.push("CAda");
        stackArray.push("DWGjf");
        stackArray.push("Efjdfsgok");
        stackArray.push("Flek");

        String ele=stackArray.pop();

        String[] array= stackArray.getStackArray();

        for (String value: array)
            System.out.println(value);

       CustomStackUsingLinkedList<Integer> stackUsingLinkedList = new CustomStackUsingLinkedList<>();
        stackUsingLinkedList.push(2);
        stackUsingLinkedList.push(4);
        stackUsingLinkedList.push(5);
        stackUsingLinkedList.push(7);
        stackUsingLinkedList.push(9);

        int val =stackUsingLinkedList.pop();

        stackUsingLinkedList.getStackArray();

    }
}
