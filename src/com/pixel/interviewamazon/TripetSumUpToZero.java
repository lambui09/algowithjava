package com.pixel.interviewamazon;

import java.util.HashSet;
import java.util.Set;

public class TripetSumUpToZero {
    public static boolean isCheckTripletSum(int[] arr) {
        int length = arr.length;
        boolean isTripletSumZero = false;
        for (int i = 0; i < length - 1; i++) {
            //check sum = -a[i]
            Set<Integer> integerSet = new HashSet<>();
            for (int j = i + 1; j < length; j++) {
                int x = -(arr[i] + arr[j]);
                System.out.println("x= " + integerSet);
                if (integerSet.contains(x)) {
                    isTripletSumZero = true;
                    System.out.println("arr[i]=" + arr[i] + "arr[j]=" + arr[j]);
                } else {
                    integerSet.add(arr[j]);
                    System.out.println("set" + integerSet);
                }
            }
        }
        if (isTripletSumZero) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -2, 2, 3};
        System.out.println("" + isCheckTripletSum(arr));
    }
}
