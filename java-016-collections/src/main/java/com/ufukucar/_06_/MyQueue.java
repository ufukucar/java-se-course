package com.ufukucar._06_;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MyQueue {

    public static void main(String[] args) {


        Queue <String> myQueue = new ArrayBlockingQueue<>(33);

        myQueue.add("Abdullah");
        myQueue.add("Uğur");
        myQueue.add("Kürşat");
        myQueue.add("Mustafa");
        myQueue.add("Abdullah");
        myQueue.add("Burak");
        myQueue.add("Burak");
        myQueue.add("Burak");

        System.out.println(myQueue);
        System.out.println("-----------------------------");


        /** Priority QUEUE **/
        Queue <String> myQueue2 = new PriorityQueue<>(33);

        myQueue2.add("Abdullah");
        myQueue2.add("Uğur");
        myQueue2.add("Kürşat");
        myQueue2.add("Mustafa");
        myQueue2.add("Abdullah");
        myQueue2.add("Burak");
        myQueue2.add("Burak");
        myQueue2.add("Burak");

        System.out.println(myQueue2);
        System.out.println("-----------------------------");








    }


}
