package com.sample.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackSample {

    public static void main(String[] args) {
        //stack
        Stack<String> stack = new Stack<String>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");
        // Iterator for the stack
        Iterator<String> itr = stack.iterator();
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        stack.pop();
        // Iterator for the stack
        itr = stack.iterator();
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }
}
