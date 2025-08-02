package com.prabhjot.main.dsa.recursion.string_based;

public class RemoveChar {
    static String result = "";

    public static void main(String[] args) {
        String a = "baccad"; // result -> "bccd".
        func(a, 0);
        System.out.println(result);
    }

    private static void func(String a, int start) {
        if (start == a.length()) return;

        if (a.charAt(start) != 'a') result += a.charAt(start);

        func(a, start + 1);
    }
}
