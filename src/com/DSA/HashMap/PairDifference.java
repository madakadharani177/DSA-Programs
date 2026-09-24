package com.DSA.HashMap;

import java.util.HashMap;
import java.util.Map;

public class PairDifference {
	 public static void main(String[] args) {

	        int arr[] = {1, 5, 3, 4, 2};
	        int k = 2;

	        Map<Integer, Integer> map = new HashMap<>();

	        for (int i = 0; i < arr.length; i++) {

	            int num = arr[i];

	            // Check whether num - k already exists
	            if (map.containsKey(num - k)) {

	                System.out.println("Pair found");
	                System.out.println("Indexes: " + map.get(num - k) + " " + i);
	                System.out.println("Values: " + (num - k) + " " + num);
	                return;
	            }

	            // Check whether num + k already exists
	            if (map.containsKey(num + k)) {

	                System.out.println("Pair found");
	                System.out.println("Indexes: " + map.get(num + k) + " " + i);
	                System.out.println("Values: " + (num + k) + " " + num);
	                return;
	            }

	            map.put(num, i);
	        }

	        System.out.println("No pair found");
	    }
}
