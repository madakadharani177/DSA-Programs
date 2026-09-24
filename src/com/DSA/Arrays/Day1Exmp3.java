package com.DSA.Arrays;

public class Day1Exmp3 {
	public static void main(String[] args) {
		// update an array
		
		 int[] arr = {12, 14, 16, 19};
	        int pos = 2;
	        int val = 15;

	        // Direct update
	        arr[pos] = val;

	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
		}
}
