package com.company;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class IntQueue {
    private Queue<Integer> queue;

    public IntQueue() {
        this.queue = new LinkedList<>();
    }

    public void addInt(int element) {
        queue.add(element);
    }

    public void showAllElements() {
        System.out.print("Elements in queue: ");
        for (int q : queue) {
            System.out.print(q + " ");
        }
        System.out.println();
    }

    public int dequeue() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.poll();
    }

    public int peek() throws NoSuchElementException {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        System.out.println("Front element of queue: " + queue.peek());
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        System.out.println("Size of queue: " + queue.size());
        return queue.size();
    }
}
