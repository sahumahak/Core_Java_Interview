package com.rays.StreamAPIProgram;

import java.util.Arrays;
import java.util.List;

import java.util.Arrays;
import java.util.List;

public class StreamStartWithT {
    public static void main(String[] args) {
        //  List<String> list = Arrays.asList("one", "two", "three", "three", "four");
        String[] name = {"one", "two", "three", "three", "four"};

        Arrays.stream(name).map(e -> e.toUpperCase()).filter(e -> e.startsWith("T")).distinct().forEach(e -> System.out.println(e));
    }
}


