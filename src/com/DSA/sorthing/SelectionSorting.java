package com.DSA.sorthing;

public class SelectionSorting {

    public static void SelectionSort(int arr[]) {

        for(int i = 0; i < arr.length - 1; i++) {

            int min = i;

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 1, 4, 3};

        SelectionSort(arr);

        System.out.println("Selection Sort array:");

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}