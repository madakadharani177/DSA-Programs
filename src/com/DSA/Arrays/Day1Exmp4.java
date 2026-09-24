package com.DSA.Arrays;

public class Day1Exmp4 {
	 public static void main(String[] args) {

	        // Sum of array, Average, Minimum element, Maximum element
	        int arr[] = {12, 14, 16, 19};

	        int sum = 0;
	        int min = arr[0];
	        int max = arr[0];

	        for (int i = 0; i < arr.length; i++) {
	            // Sum
	            sum = sum + arr[i];
	            // Minimum
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	            // Maximum
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        // Average
	        double average = (double) sum / arr.length;
	        System.out.println("Sum = " + sum);
	        System.out.println("Average = " + average);
	        System.out.println("Minimum = " + min);
	        System.out.println("Maximum = " + max);
	    }
}
