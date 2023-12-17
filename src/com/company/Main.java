package com.company;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        IntQueue intQueue = new IntQueue();

        intQueue.addInt(5);
        intQueue.addInt(7);
        intQueue.addInt(12);

        intQueue.showAllElements();

        intQueue.size();
        intQueue.peek();

        try {
            IntQueue emptyQueue = new IntQueue();

            emptyQueue.showAllElements();
            emptyQueue.size();
            emptyQueue.peek();

            while (!emptyQueue.isEmpty()) {
                System.out.println(emptyQueue.dequeue());
            }
        } catch (NoSuchElementException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
