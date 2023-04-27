package org.example;

public class Task3 {
    public static int[] arrayDifference(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays must have equal length");
        }

        int[] diffArr = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            diffArr[i] = arr1[i] - arr2[i];
        }

        return diffArr;
    }
}
