package com.sample.collection;

import java.util.*;

// https://xie.infoq.cn/article/e1b42f77c465f501ba3727c1d
public class SetSample {
    public static void main(String[] args) {
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        // A LinkedHashSet is very similar to a HashSet.
        // The difference is that this uses a doubly linked list to store the data and retains the ordering of the elements.

        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Geeks");
        lhs.add("For");
        lhs.add("Geeks");
        lhs.add("Is");
        lhs.add("Very helpful");

        // Traversing elements
        Iterator<String> litr = lhs.iterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }


        // Creating TreeSet and adding elements
        // auto-sort

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("a");
        ts.add("b");
        ts.add("z");
        ts.add("x");
        ts.add("m");
        // Traversing elements
        Iterator<String> itrt = ts.iterator();
        while (itrt.hasNext()) {
            System.out.println(itrt.next());
        }

        hs.retainAll(lhs); // interaction
        hs.removeAll(lhs);
        System.out.println(hs);

        SortedSet<String> newts = new TreeSet<String>();
        // Adding elements into the TreeSet 
        // using add()
        newts.add("India");
        newts.add("Australia");
        newts.add("South Africa");


        TreeSet<Integer> ns = new TreeSet<>();
        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);
        // Get a reverse view of the navigable set
        NavigableSet<Integer> reverseNs = ns.descendingSet();
        System.out.println();

        for (int s : ns) {
            System.out.println(s);
        }
        Iterator it = ns.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
