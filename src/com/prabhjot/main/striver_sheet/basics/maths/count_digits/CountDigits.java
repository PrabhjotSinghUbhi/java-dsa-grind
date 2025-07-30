package com.prabhjot.main.striver_sheet.basics.maths.count_digits;

import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(countDigit(num));
    }

    private static int countDigit(int num) {
        return num == 0 ? 1 : (int) Math.log10(num) + 1;
    }
}
