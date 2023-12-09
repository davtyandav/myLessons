package org.example.dataStructure.file;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet=new HashSet<>();
        stringSet.add("ss");
        stringSet.add(null);
        System.out.println(stringSet);
    }
}
