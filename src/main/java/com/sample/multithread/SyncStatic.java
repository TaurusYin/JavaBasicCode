package com.sample.multithread;

// Java Program Illustrate Synchronized
// Using static synchronization

// Class 1
// Helper class
class StaticPrintTest extends Thread {

    // Static synchronization locks the class PrintTest
    synchronized public static void printThread(int n)
    {

        for (int i = 1; i <= 10; i++) {

            // Print message when threads are executing
            System.out.println("Thread " + n
                    + " is working...");

            // Try block to check for exceptions
            try {

                // making thread to sleep for 0.6 seconds
                Thread.sleep(600);
            }

            // Catch block to handle the exceptions
            catch (Exception ex) {

                // Print message when exception occurs
                System.out.println(ex.toString());
            }
        }

        // Display message for better readability
        System.out.println("--------------------------");

        try {
            Thread.sleep(1000);
        }

        catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

// Class 2
// Helper class extending Thread class
class StaticThread1 extends Thread {

    // run() method for thread
    public void run()
    {

        // Passing the class not the object
        StaticPrintTest.printThread(1);
    }
}

// Class 3
// Helper class extending Thread class
class StaticThread2 extends Thread {

    public void run()
    {

        // Passing the class not the object
        StaticPrintTest.printThread(2);
    }
}

// Class 4
// Main class
class StaticSynchroTest {

    // Main driver method
    public static void main(String[] args)
    {

        // No shared object
        // Creating objects of class 2 and 3 that
        // are extending to Thread class
        StaticThread1 t1 = new StaticThread1();
        StaticThread2 t2 = new StaticThread2();

        // Starting thread with help of start() method
        t1.start();
        t2.start();
    }
}

