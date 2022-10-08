package com.sample.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionOperation {
    public static void main(String[] args) {
        // Creating a list
        // Declaring object of string type
        List<String> items = new ArrayList<>();

        // Adding elements (items) to the list
        items.add("Shoes");
        items.add("Toys");

        // Add one or more elements
        Collections.addAll(items, "Fruits", "Bat", "Ball");

        // Printing the list contents
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }


        // Creating a list
        // Declaring object of string type
        List<String> sortItems = new ArrayList<>();

        // Adding elements to the list
        // using add() method
        sortItems.add("Shoes");
        sortItems.add("Toys");

        // Adding one or more elements using addAll()
        Collections.addAll(sortItems, "Fruits", "Bat", "Mouse");

        // Sorting according to default ordering
        // using sort() method
        Collections.sort(sortItems);

        // Printing the elements
        for (int i = 0; i < sortItems.size(); i++) {
            System.out.print(sortItems.get(i) + " ");
        }

        System.out.println();

        // Sorting according to reverse ordering
        Collections.sort(sortItems, Collections.reverseOrder());

        // Printing the reverse order
        for (int i = 0; i < sortItems.size(); i++) {
            System.out.print(sortItems.get(i) + " ");
        }


        List<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,1, 2, 5, 100, 34, 5);
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 - o2 > 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });



        System.out.println(arrayList);
        List<Integer> newArrayList = new ArrayList<>(arrayList);
        Collections.copy(newArrayList, arrayList);
        System.out.println(newArrayList);


    }
}
