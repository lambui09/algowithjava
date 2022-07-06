package com.pixel.interviewtopic;

import java.util.Scanner;

public class TenYenStamp {
    public static int step(int n, int expect) {
        int result = 0;
        if (n >= expect) {
            return 0;
        }
        while (n < expect) {
            result++;
            n = n + 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int expect = scanner.nextInt();
        int k = 0;
        int kitte = n;
        System.out.println(step(n, expect));
        while (true) {
            if (kitte > expect) {
                System.out.println(k);
            }
            kitte = kitte + 10;
            k++;
        }
    }
}



