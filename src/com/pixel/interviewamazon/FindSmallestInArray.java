package com.pixel.interviewamazon;

import java.util.Arrays;

public class FindSmallestInArray {
    public static int findSmallest(int[] arr) {
        int[] b = Arrays.stream(arr).sorted().toArray();
        System.out.println("smallest" + b[b.length - 1] + "second" + b[b.length - 2]);
        return 0;
    }


    public static void main(String[] args) {
        int[] array = {2, 4, 3, 5, 6};
        findSmallest(array);
    }
}
