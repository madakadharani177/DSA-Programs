package com.DSA.Arrays;

public class DSADay1 {
	public static void main(String[] args) {
		
		// ARRAY INSERTION 
			
		int arr[] = {12,14,16,19};;
		int pos = 2;
		int val =15;
		int arr1[] = new int[arr.length+1];
		for(int i =0; i<pos;i++) {
			arr1[i] = arr[i];	
			}
		arr1[pos] = val;
		for(int i = pos;i<arr.length;i++) {
			arr1[i+1] = arr[i];
		}
		for(int i =0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		}

}
