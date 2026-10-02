package com.DSA.Recursion;

public class Stairs {
	public static int countways(int n) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		return countways(n-1)+countways(n-2);
	}
	public static void main(String[] args) {
		int n= 14;
		System.out.println(countways(n));
	}
}
