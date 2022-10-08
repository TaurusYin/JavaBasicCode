package com.sample.collection;

import java.util.*;

public class MapSample {
    public static void main(String[] args) {
        // Creating HashMap and
        // adding elements
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");
        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));
        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        Map<Integer, String> sm = Collections.synchronizedMap(new HashMap<Integer, String>());
        sm.putAll(hm);


        // No need to mention the
        // Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();
        // Inserting the Elements
        // using put() method
        ht1.put(1, "Geeks");
        ht1.put(2, "For");
        ht1.put(3, "Geeks");

        ht2.put(1, "Geeks");
        ht2.put(2, "For");
        ht2.put(3, "Geeks");

        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

        // Inserting mappings into Map
        // using put() method
        lhm.put(3, "Geeks");
        lhm.put(2, "Geeks");
        lhm.put(1, "Geeks");

        // Printing mappings to the console
        System.out.println("Initial map : " + lhm);

        // Updating the value with key 2
        lhm.put(2, "For");

        // Printing the updated Map
        System.out.println("Updated Map : " + lhm);


        SortedMap<String, String> tm = new TreeMap<String, String>(new Comparator<String>() {
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        // Adding elements into the TreeMap
        // using put()
        tm.put("India", "1");
        tm.put("Australia", "2");
        tm.put("South Africa", "3");
        // Displaying the TreeMap
        System.out.println(tm);


        // 所以，EntrySet的性能比 KeySet 的性能高出了一倍，因为 KeySet 相当于循环了两遍 Map 集合，而 EntrySet 只循环了一遍。
        Iterator<Map.Entry<Integer, String>> iterator = lhm.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        lhm.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });

        lhm.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });

        lhm.entrySet().parallelStream().forEach((entry) -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });


    }
}
