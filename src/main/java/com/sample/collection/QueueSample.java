package com.sample.collection;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueSample {
    public static void main(String[] args) {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(200);
        pQueue.add(5);
        int length = pQueue.size();
        Iterator iterator = pQueue.iterator();
        while (iterator.hasNext()) {
            int res = (int)iterator.next();
            System.out.println(res);

        }

        for (int i = 0; i < length; i++) {
            System.out.println(pQueue.poll());
        }

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());




        // Initializing an deque
        ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);

        // add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);

        // clear() method
        de_que.clear();

        // addFirst() method to insert the
        // elements at the head
        de_que.addFirst(564);
        de_que.addFirst(291);

        // addLast() method to insert the
        // elements at the tail
        de_que.addLast(24);
        de_que.addLast(14);

        System.out.println(de_que);


        // 遍历
        for (int q : de_que) {
            System.out.println(q);
        }

        Iterator it = de_que.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }




    }
}
