package com.sample.multithread;

// Java Program Illustrating Lock the Object for
// the shared resource giving consistent output

// Class 1
// Helper class extending Thread class
class PrintTest extends Thread {

    // synchronized code
    // synchronized method will lock the object and
    // releases when thread is terminated or completed its
    // execution.
    synchronized public void printThread(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + n
                    + " is working...");

            try {

                // pause the execution of current thread
                // for 600 millisecond
                Thread.sleep(600);
            } catch (Exception ex) {
                // overrides toString() method and prints
                // exception if occur
                System.out.println(ex.toString());
            }
        }
        System.out.println("--------------------------");
        try {

            // pause the execution of current thread for
            // 1000 millisecond
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
// creating thread1 extending Thread Class

class Thread1 extends Thread {

    PrintTest test;

    Thread1(PrintTest p) {
        test = p;
    }

    public void run() // entry point for thread1
    {

        test.printThread(1);
    }
}
// creating thread2 extending Thread Class

class Thread2 extends Thread {

    PrintTest test;

    Thread2(PrintTest p) {
        test = p;
    }

    public void run() // entry point for thread2
    {
        test.printThread(2);
    }
}

class SynchroTest {

    public static void main(String[] args) {

        PrintTest p = new PrintTest();

        // passing the same object of class PrintTest to
        // both threads
        Thread1 t1 = new Thread1(p);
        Thread2 t2 = new Thread2(p);

        // start function will execute the threads
        t1.start();
        t2.start();
    }
}
