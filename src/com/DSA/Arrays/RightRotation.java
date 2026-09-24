package com.DSA.Arrays;

public class RightRotation {

    public static void main(String[] args) {

        // Right 2 rotations
        // With direct formula
        /*
        int arr[] = {10, 20, 30, 40, 50};
        int k = 2;
        k = k % arr.length;
        int newarr[] = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[(i - k + arr.length) % arr.length];
        }

        for (int x : newarr) {
            System.out.print(x + " ");
        }
        */
        // With brute force

        int arr[] = {10, 20, 30, 40, 50};
        for (int r = 1; r <= 2; r++) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}