package com.example.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMain {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Rohit");
        list.add("Rishi");
        list.add("Taher");
        list.add("Meghana");
        list.add("Sourabh");

        // print using for each loop
//        for (String s : list) {
//            System.out.println(s);
//        }

        // using stream API
        list.stream().forEach(t -> System.out.println(t));

        // MAP
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "DS");
        map.put(4, "Angular");
        map.put(5, "JS");

        map.forEach((key, value) -> System.out.println(key + " " + value)); // not using the stream method

        // using stream method
        map.entrySet().stream().forEach(obj -> System.out.println(obj));
        System.out.println("######################");

        // filter method
        List<String> list2 = new ArrayList<>();
        list2.add("Rohan");
        list2.add("Ritik");
        list2.add("Priya");
        list2.add("Rahul");
        list2.add("Roshan");

        list2.stream().filter(t -> t.startsWith("R")).forEach(t -> System.out.println(t));

        Map<Long, String> map2 = new HashMap<>();
        map2.put(101l, "East");
        map2.put(102l, "West");
        map2.put(103l, "North");
        map2.put(104l, "South");

        map2.entrySet().stream().filter(t -> t.getKey() % 2 == 0l).forEach(t -> System.out.println(t));

        List<Integer> listToSort = new ArrayList<>();
        listToSort.add(5);
        listToSort.add(43);
        listToSort.add(523);
        listToSort.add(56);
        listToSort.add(25);
        System.out.println("Before sorting " + listToSort);

        Collections.sort(listToSort);
        System.out.println("After sorting " + listToSort); // Ascending order

        Collections.reverse(listToSort);
        System.out.println("######################");

        listToSort.stream().sorted().forEach(t -> System.out.println("ASC: " + t)); // Ascending
        listToSort.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println("Desc: " + t)); // Descending
                                                                                                              // order









    }

}
