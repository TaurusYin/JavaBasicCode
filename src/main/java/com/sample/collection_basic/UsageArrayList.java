package com.sample.collection_basic;

import java.util.ArrayList;
import java.util.Collections;

public class UsageArrayList {
}

class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        System.out.println(sites.get(1));  // 访问第二个元素
        sites.set(2, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
        sites.remove(3); // 删除第四个元素
        System.out.println(sites.size()); //计算大小
        //迭代数组列表
        for (int i = 0; i < sites.size(); i++) {
            System.out.println(sites.get(i));
        }
        for (String i : sites) {
            System.out.println(i);
        }

        // 字母排序
        Collections.sort(sites);
        for (String i : sites) {
            System.out.println(i);
        }



    }
}