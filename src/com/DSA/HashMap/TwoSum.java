package com.DSA.HashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {

        int num[] = {2, 7, 11, 15};
        int target = 9;

        // Map stores: value -> index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {

            int complement = target - num[i];

            if (map.containsKey(complement)) {

                System.out.println("Indexes: " + map.get(complement) + " " + i);
                return;
            }

            map.put(num[i], i);
        }

        System.out.println("No pair found");
    }
}
