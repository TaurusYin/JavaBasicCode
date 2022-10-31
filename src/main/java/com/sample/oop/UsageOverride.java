package com.sample.oop;

public class UsageOverride {
}


class AnimalNew{
    public void move(){
        System.out.println("动物可以移动");
    }
}

class DogNew extends AnimalNew{
    public void move(){
        System.out.println("狗可以跑和走");
    }
}

class TestDog{
    public static void main(String args[]){
        AnimalNew a = new AnimalNew(); // Animal 对象
        AnimalNew b = new DogNew(); // Dog 对象

        a.move();// 执行 Animal 类的方法

        b.move();//执行 Dog 类的方法
    }
}