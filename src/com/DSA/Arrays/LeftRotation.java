package com.DSA.Arrays;

public class LeftRotation {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int newarr[] = new int[arr.length];
        int k = 2;
        for (int i = 0; i < arr.length; i++) {

            newarr[i] = arr[(i + k) % arr.length];

        }
        System.out.println("New array:");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}