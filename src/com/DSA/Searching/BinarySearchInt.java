package com.DSA.Searching;

public class BinarySearchInt {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 4, 4};
	        int target = 2;
	        int left = 0;
	        int right = arr.length - 1;
	        while (left <= right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] == target) {
	                System.out.println("Found at: " + mid);
	                return;
	            }
	            else if (arr[mid] > target) {
	                right = mid - 1;
	            }
	            else {
	                left = mid + 1;
	            }
	        }
	        System.out.println("Not found....");
	    }
}
