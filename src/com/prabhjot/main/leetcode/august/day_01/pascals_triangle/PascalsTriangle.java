package com.prabhjot.main.leetcode.august.day_01.pascals_triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 30;
        System.out.println(makePascalTriangle(numRows));
    }

    private static List<List<Integer>> makePascalTriangle(int n) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for (int row = 0; row < n; row++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) { // first and last.
                    currentRow.add(1);
                } else {
                    int left = pascalTriangle.get(row - 1).get(col);
                    int right = pascalTriangle.get(row - 1).get(col - 1);
                    currentRow.add(left + right);
                }
            }
            pascalTriangle.add(currentRow);
        }

        return pascalTriangle;
    }
}