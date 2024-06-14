package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {

    public static void main(String[] args) {
        String input = "1?0@#";

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

        Pattern specialCharPattern = Pattern.compile("[^a-zA-Z0-9]");

        if (index == arr.length) {
            results.add(new String(arr));
            return;
        }

        Matcher matcher = specialCharPattern.matcher(Character.toString(arr[index]));
        if (matcher.matches()) {
            arr[index] = '0';
            test(arr, index + 1, results);

            arr[index] = '1';
            test(arr, index + 1, results);

            // Restoring the original character
            arr[index] = matcher.group().charAt(0);
        } else {
            test(arr, index + 1, results);
        }
    }

}
