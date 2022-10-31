package com.sample.oop;

public class UsageEnum {
}

enum Color
{
    RED, GREEN, BLUE;
}

class MyClass {
    public static void main(String[] args) {
        Color myVar = Color.BLUE;

        switch(myVar) {
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
        }
    }
}

enum ColorM
{
    RED, GREEN, BLUE;

    // 构造函数
    private ColorM()
    {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}

