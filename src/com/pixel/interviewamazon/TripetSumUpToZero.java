package com.pixel.interviewamazon;

import java.util.Arrays;
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


    public static int checkTripletSum(int[] arr) {
        int sum = 0;
        int wantSumTriplet = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int j = 0; j < arr.length; j++) {
            sum = sum - arr[j];
            if (wantSumTriplet == sum) {
                return arr[j + 1];
            } else {
                wantSumTriplet += arr[j];
            }
        }
        return -1;
    }

    /**
     * check with
     */

    public static boolean checkTripletSumComplexity(int[] arr, int sumRequire) {
        int lengthArr = arr.length;
        if (lengthArr < 3) {
            return false;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) { //Complexity 0(n)
            int startIndex = i + 1;
            int endIndex = lengthArr - 1;
            while (startIndex < endIndex) {// Complexity 0(nlogn)
                int sumTemp = arr[i] + arr[startIndex] + arr[endIndex];
                if (sumTemp == sumRequire) {
                    return true;
                } else if (sumTemp < sumRequire) {
                    startIndex++;
                } else {
                    endIndex--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        System.out.println("" + checkTripletSumComplexity(arr, 0));
    }
}
