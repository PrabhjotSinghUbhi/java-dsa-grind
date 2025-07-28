package com.prabhjot.main.dsa.recursion.easy;

public class NoOfSteps {

//    static int steps = 0;

    public static void main(String[] args) {
        int num = 14;
        System.out.println(steps2(num));
    }

    private static int steps2(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if ((num & 1) == 0) {
            return helper(num / 2, steps + 1);
        }
        return (helper(num - 1, steps + 1));
    }

//    private static void steps(int num) {
//        if (num == 0) {
//            return;
//        }
//
//        if ((num & 1) == 0) {
//            steps(num / 2);
//        } else {
//            steps(num - 1);
//        }
//        steps++;
//    }


}
