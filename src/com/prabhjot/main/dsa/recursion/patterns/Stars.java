package com.prabhjot.main.dsa.recursion.patterns;

public class Stars {
    public static void main(String[] args) {
        printRightTriangle(5, 0);
        System.out.println();
        printInvertedRightTriangle(4, 0);

    }

    private static void printInvertedRightTriangle(int r, int c) {

        if (r == 0) return; // Base Condition.

        //this if statement is acting as a loop.
        if (r > c) {
            System.out.print(" * ");
            printInvertedRightTriangle(r, c + 1);
        } else {
            System.out.println();
            printInvertedRightTriangle(r - 1, 0);
        }

    }

    private static void printRightTriangle(int r, int c) {

        if (r == 0) return;

        if (r > c) {
            printRightTriangle(r, c + 1);
            System.out.print(" * ");
        } else {
            printRightTriangle(r - 1, 0);
            if (r != 0) System.out.println();
        }
    }

}
