package com.sample.oop;

public class MassTest {
}

class A {
    private int a;
    private int b;

    A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void PrintMessage(){
        System.out.println("a: "+a +" b: "+b);
    }


}

class Test{
    public static void main(String[] args) {
        A InsA = new A(1,2);
        InsA.PrintMessage();
    }
}


