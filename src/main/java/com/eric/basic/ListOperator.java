package com.eric.basic;


import java.util.LinkedList;

/*
 *使用LinkedList模拟栈数据结构的集合，并测试
 *1、栈的特点先进后出
 *2、 LinkedList的特有添加功能addFirst()
 */
class MyStack {
    private LinkedList link;

    public MyStack() {
        link = new LinkedList();
    }

    public void add(Object obj) {
        // 将指定元素插入此列表的开头
        link.addFirst(obj);
    }

    public Object get() {
        // 移除并返回此列表的第一个元素。
        // return link.getFirst();
        return link.removeFirst();
    }

    public boolean isEmpty() {
        return link.isEmpty();
    }
}

/*
 * MyStack的测试
 */
public class ListOperator {
    public static void main(String[] args) {
        // 创建集合对象
        MyStack ms = new MyStack();
        // 添加元素
        ms.add("hello");
        ms.add("world");
        ms.add("java");
        ms.add("android");
        ms.add("javase");
        while (!ms.isEmpty()) {
            System.out.println(ms.get());
        }
    }
}