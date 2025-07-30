package com.prabhjot.main.dsa.hashing.hasing_strings;

public class HashingStrings {
    public static void main(String[] args) {
        System.out.println((int) 'a'); // 97

        String str = "The quick brown fox jumps over the lazy dog".toLowerCase();

        int[] hash = new int[256];

        //mapping of chars. like 0 index -> a, 1 -> b, 3 ->c
        for (int i = 0; i < str.length(); i++) hash[((str.charAt(i)))] += 1;


        for (int i = 'a'; i <= 'z'; i++) System.out.printf("%c has appeared %d times \n", (char) i, hash[i]);

    }
}
