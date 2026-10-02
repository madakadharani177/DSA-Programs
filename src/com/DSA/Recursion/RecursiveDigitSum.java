package com.DSA.Recursion;

public class RecursiveDigitSum {
	public static int digitSum(int n) {
		if(n<10) {
			return 0;
		}
		int sum = 0;
		while(n>0) {
			sum = sum+n%10; //extract
			n = n/10; //remaining extract
		}
		return digitSum(sum);
	}
	public static void main(String[] args) {
		System.out.println(digitSum(9854));
	}
}
