package com.pixel.interviewamazon;

public class FindNumberMissingOnArray {
    public static int findNumberMissingOnArray(int[] arr) {
        int n = arr.length;
        int sumTotal = ((n + 1) * (n + 2)) / 2;
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
