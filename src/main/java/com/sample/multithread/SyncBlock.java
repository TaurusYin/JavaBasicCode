package com.sample.multithread;

// Java Program Illustrating Synchronized Code
// Using synchronized block

// Class 1
// Helper class extending Thread class
class PrintTestBlock extends Thread {

    // Method 1
    // To print the thread
    public void printThread(int n) {

        // Making synchronized block that makes the block
        // synchronized
        synchronized (this) {

            // Iterating using for loop
            for (int i = 1; i <= 10; i++) {

                // Print message when these thread are
                // executing
                System.out.println("Thread " + n
                        + " is working...");

                // Try block to check for exceptions
                try {

                    // Making thread to pause for 0.6
                    // seconds
                    Thread.sleep(600);
                }

                // Catch block to handle exceptions
                catch (Exception ex) {

                    // Print message when exception.s occur
                    System.out.println(ex.toString());
                }
            }
        }

        // Display message only
        System.out.println("--------------------------");

        try {

            // Making thread t osleep for 1 sec
            Thread.sleep(1000);
        } catch (Exception ex) {

            System.out.println(ex.toString());
        }
    }
}

// Class 2
// Helper class extending Thread class
class BlockThread1 extends Thread {

    PrintTestBlock test;

    BlockThread1(PrintTestBlock p) {
        test = p;
    }

    public void run() {
        test.printThread(1);
    }
}

// Class 3
// Helper class extending Thread class
class BlockThread2 extends Thread {

    PrintTestBlock test;

    BlockThread2(PrintTestBlock p) {
        test = p;
    }

    public void run() {
        test.printThread(2);
    }
}

// Class 4
// Main class
class BlockSynchroTest {

    // Main driver method
    public static void main(String[] args) {

        // Creating instance for class 1 inside main()
        PrintTestBlock p = new PrintTestBlock();

        // Creating threads and
        // passing same object
        BlockThread1 t1 = new BlockThread1(p);
        BlockThread2 t2 = new BlockThread2(p);

        // Starting these thread using start() method
        t1.start();
        t2.start();
    }
}
