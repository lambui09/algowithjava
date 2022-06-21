package com.pixel;
/**
 *
 *     int m = n + 1;
 *
 *     // get a sum of integers between 1 and `n+1`
 *     int total = m*(m + 1)/2;
 *
 * */
public class Main {

    public static int findNumberMissingOnArray(int[] arr) {
        int n = arr.length;
        int sumTotal = ((n+1) * (n + 2)) / 2;
        int sum = 0;
        System.out.println("" + sumTotal);
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sumTotal - sum;
    }

    public static void main(String[] args) {
        // write your code here
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println(findNumberMissingOnArray(arr));
    }

}
