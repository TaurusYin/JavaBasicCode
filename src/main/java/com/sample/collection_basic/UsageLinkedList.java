package com.sample.collection_basic;

import java.util.LinkedList;



class UsageLinkedList {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        sites.addFirst("Wiki");// 使用 addFirst() 在头部添加元素
        sites.addLast("Wiki");// 使用 addLast() 在尾部添加元素
        sites.removeFirst();// 使用 removeFirst() 移除头部元素
        sites.removeLast();// 使用 removeLast() 移除尾部元素
        System.out.println(sites.getFirst());// 使用 getFirst() 获取头部元素
        System.out.println(sites.getLast());// 使用 getLast() 获取尾部元素



        for (int size = sites.size(), i = 0; i < size; i++) {
            System.out.println(sites.get(i));
        }

        for (String i : sites) {
            System.out.println(i);
        }


    }

}
