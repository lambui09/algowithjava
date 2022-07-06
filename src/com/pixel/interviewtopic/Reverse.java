package com.pixel.interviewtopic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        int length = str.length();
        String str1 = str.substring(0, x - 1);
        String str3 = str.substring(y, length);
        StringBuffer stringBuffer = new StringBuffer(str.substring(x - 1, y)).reverse();
        System.out.println("" + str1 + stringBuffer + str3);

    }
}
