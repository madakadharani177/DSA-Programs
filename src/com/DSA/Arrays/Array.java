package com.DSA.Arrays;

public class Array {
	public static void main(String[] args) {
		 // Array declaration
		 int[] arr;
		// Array creation
		 arr = new int[5];
		 // Assigning values
		 arr[0] = 10;
		 arr[1] = 20;
		 arr[2] = 30;
		 arr[3] = 40;
		 arr[4] = 50;
		 // Accessing individual elements
		 System.out.println("First element: " + arr[0]);
		 System.out.println("Third element: " + arr[2]);
		 // Traversal
		 for(int i = 0; i < arr.length; i++) {
			 System.out.println("Index = " + i + ", Value = " + arr[i] );
			 }
		 }
}
