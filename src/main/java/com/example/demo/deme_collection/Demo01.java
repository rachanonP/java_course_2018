package com.example.demo.deme_collection;

import java.util.*;

/**
 * package .util
 * List
 * Set
 * Deque
 * Map
**/

public class Demo01 {

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.demoList();
        demo01.demoMap();
    }

    private void demoMap() {
        Map<String, Integer> names = new HashMap<>();
        names.put("n1", 20);
        names.put("n2", 30);
        Set<String> keys = names.keySet();
        for (String key : keys) {
            System.out.println(key + " = " +names.get(key));
        }
    }

    private void demoList() {
        System.out.println("Call demoList");
        // Generic
        List<String> names = new ArrayList<>();
        names.add("Name1");
        names.add("Name2");
        for (String name: names) {
            System.out.println(name);
        }
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
    }
}
