package com.DSA.Recursion;

public class SumDemo {
	public static int sumLoop(int n) {
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			sum = sum+i;
		}
		return sum;
	}
	public static int sumRecursion(int n) {
		//base condition
		if(n==0) {
			return 0;
		}
		return n+sumRecursion(n-1);
	}
	public static void main(String[] args) {
		System.out.println("Loop: "+sumLoop(5));
	}
}
