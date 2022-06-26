package com.pixel.interviewamazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TripletSumUpToX {
    public static ArrayList<ArrayList<Integer>> isCheckEqualValue(List<Integer> arr, int x) {
        ArrayList<ArrayList<Integer>> listCorrect = new ArrayList<>();
        int length = arr.size();
        boolean isSumTripleEqualX = false;
        for (int i = 0; i < length - 1; i++) {
            Set<Integer> integerSet = new HashSet<Integer>();
            for (int j = i + 1; j < length; j++) {
                int sum = arr.get(i) + arr.get(j);
                int k = x - sum;
                if (integerSet.contains(k)) {
                    ArrayList<Integer> listSub = new ArrayList<>();
                    listSub.add(arr.get(i));
                    listSub.add(arr.get(j));
                    listSub.add(k);
                    listCorrect.add(listSub);
                } else {
                    integerSet.add(arr.get(j));
                }
            }
        }
        return listCorrect;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int x = -2;
        List<Integer> integerList = IntStream.of(arr).boxed().collect(Collectors.toList());
        System.out.println("" + isCheckEqualValue(integerList, x));
    }
}
