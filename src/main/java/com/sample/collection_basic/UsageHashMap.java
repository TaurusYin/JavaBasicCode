package com.sample.collection_basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UsageHashMap {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);
        System.out.println(Sites.get(3));
        Sites.remove(4);
        System.out.println(Sites);
        //Sites.clear();
        System.out.println(Sites);
        System.out.println(Sites.size());

        // 输出 key 和 value
        for (Integer i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
        // 返回所有 value 值
        for(String value: Sites.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }

        // Iterating entries using a For Each loop
        for (Map.Entry<Integer, String> entry : Sites.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }


        Iterator<Map.Entry<Integer, String>> entries = Sites.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, String> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        Sites.forEach((k, v) -> System.out.println("key: " + k + " value:" + v));



    }
}
