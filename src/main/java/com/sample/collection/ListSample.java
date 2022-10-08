package com.sample.collection;


// Java program to demonstrate
// why collection framework was needed

import java.util.*;

class ListSample {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        Integer get_res = arrayList.get(1); // get index
        Boolean bool_res = arrayList.contains(3); // contain element
        arrayList.remove(1);
        int index = arrayList.indexOf(5);
        arrayList.remove(index);
        arrayList.add(5);
        arrayList.remove((Integer) 5);
        arrayList.add(30);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(0, 10);
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
        System.out.println(arrayList.toString());
        int searchRes = Collections.binarySearch(arrayList, 10);
        System.out.println(arrayList.get(searchRes));



        // Creating instances of the array,
        // vector and hashtable
        int arr[] = new int[]{1, 2, 3, 4};
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();

        // Adding the elements into the
        // vector
        v.addElement(1);
        v.addElement(2);

        // Adding the element into the
        // hashtable
        h.put(1, "geeks");
        h.put(2, "4geeks");

        // Array instance creation requires [],
        // while Vector and hastable require ()
        // Vector element insertion requires addElement(),
        // but hashtable element insertion requires put()

        // Accessing the first element of the
        // array, vector and hashtable
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

        // Array elements are accessed using [],
        // vector elements using elementAt()
        // and hashtable elements using get()

        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            al.add(i);

        // Printing elements
        System.out.println(al);

        // Remove element at index 3
        al.remove(3);

        // Displaying the ArrayList
        // after deletion
        System.out.println(al);

        // Printing elements one by one
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");

        for (int x: al){
            System.out.println(x);
        }

    }
}



