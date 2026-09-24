package com.DSA.Arrays;

public class Day1Exmp2 {
	public static void main(String[] args) {
		
		// deleting an element
			
		int arr[] = {12,14,16,19};
		int pos = 2;
		
		// creating a new array
		int arr1[] = new int[arr.length-1];
		for(int i =0; i<pos;i++) {
			arr1[i] = arr[i];	
			}
		
		
		  // by using position number from 1 we can remove it from original array
			/*
			 * for(int i = pos;i<arr.length;i++) { 
			 * arr1[i-1] = arr[i]; 
			 * }
			 */
		
		// by using index number from 0 we can remove it from new array
		// remaining values....new arr
		for(int i = pos;i<arr1.length;i++) {
			arr1[i] = arr[i+1];
		}
		
		// traversing 
		for(int i =0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		}
}
