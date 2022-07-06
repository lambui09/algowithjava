package com.pixel.interviewamazon;


import java.util.Arrays;

public class ZigZag {
    public static int[] zigZag(int[] arr) {
        int size = arr.length;
        boolean flag = true;
        for (int i = 0; i < size - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                } else {
                    continue;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {4, 3, 7, 8, 6, 2, 1};
        System.out.println("output" + Arrays.toString(zigZag(array)));
    }
}
