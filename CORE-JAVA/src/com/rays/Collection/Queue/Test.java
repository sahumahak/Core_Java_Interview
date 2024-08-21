package com.rays.Collection.Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        
        Queue<Integer> q = new ArrayBlockingQueue<>(2);

        // Using offer method which returns false if the queue is full
        boolean offerResult1 = q.offer(1);
        boolean offerResult2 = q.offer(2);
        boolean offerResult3 = q.offer(3);
        
        // Checking the return value of offer method
        System.out.println("Offer Result 1: " + (offerResult1 ? "Added" : "Not Added"));
        System.out.println("Offer Result 2: " + (offerResult2 ? "Added" : "Not Added"));
        System.out.println("Offer Result 3: " + (offerResult3 ? "Added" : "Not Added"));
        
        System.out.println("Queue contents: " + q);
    }
}
