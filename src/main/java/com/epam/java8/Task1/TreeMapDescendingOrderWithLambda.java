package com.epam.java8.Task1;

import java.util.*;

public class TreeMapDescendingOrderWithLambda {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);
        map.put(1, "A");
        map.put(3, "C");
        map.put(2, "B");

        System.out.println(map);
    }
}
