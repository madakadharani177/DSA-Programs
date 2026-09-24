package com.DSA.Arrays;

public class Example7 {
	public static void main(String[] args) {
        // Non-zero elements first and zero elements last
        int arr[] = {0, 1, 0, 3, 12};
        int index = 0;
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr1[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
