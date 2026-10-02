package com.DSA.Recursion;

public class FiboDemo {
	public static int fiboRec(int n) {
		if (n <= 1) {
			return n;
		}
		return fiboRec(n - 1) + fiboRec(n - 2);
	}
}