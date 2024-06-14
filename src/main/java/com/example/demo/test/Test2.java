package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        String input = "1?0";

        List<String> results = output(input);

        for (String result : results) {
            System.out.println(result);
        }

    }

    public static List<String> output(String input) {

        List<String> results = new ArrayList<>();

        char[] arr = input.toCharArray();

        test(arr, 0, results);
        return results;
    }

    private static void test(char[] arr, int index, List<String> results) {

        if (index == arr.length) {
            results.add(new String(arr));
            return;
        }

        if (arr[index] == '?') {
            arr[index] = '0';
            test(arr, index + 1, results);

            arr[index] = '1';
            test(arr, index + 1, results);

            arr[index] = '?';
        } else {
            test(arr, index + 1, results);
        }
    }
}
