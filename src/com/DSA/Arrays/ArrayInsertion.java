package com.DSA.Arrays;

public class ArrayInsertion {
	public static void main(String[] args) {
        // Intersection of two arrays
        int arr1[] = {10, 20, 30, 60, 40, 50};
        int arr2[] = {100, 90, 80, 70, 60, 50};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Element: " + arr1[i]);
                }
            }
        }
    }
}
