package com.sample.multithread;

class VolatileExample {

    // Initializing volatile variables
    // a, b
    static volatile int a = 0, b = 0;

    // Defining a static void method
    static void method_one()
    {
        a++;
        b++;
    }

    // Defining static void method
    static void method_two()
    {
        System.out.println(
                "a=" + a + " b=" + b);
    }

    public static void main(String[] args)
    {

        // Creating an instance t1 of
        // Thread class
        Thread t1 = new Thread() {
            public void run()
            {
                for (int i = 0; i < 5; i++)
                    method_one();
            }
        };

        // Creating an instance t2 of
        // Thread class
        Thread t2 = new Thread() {
            public void run()
            {
                for (int i = 0; i < 5; i++)
                    method_two();
            }
        };

        // Starting instance t1 and t2
        t1.start();
        t2.start();
    }
}
