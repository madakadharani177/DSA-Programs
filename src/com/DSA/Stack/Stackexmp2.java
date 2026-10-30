package com.DSA.Stack;

import java.util.Arrays;
import java.util.Stack;

public class Stackexmp2 {
	public static int[] greaterEle(int arr[]) {
		int n = arr.length;
		int res[] = new int[n];
		Stack <Integer> stack = new Stack();
		for(int i = n-1;i>=0;i--) {
			while(!stack.isEmpty() && stack.peek()<=arr[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				res[i]=-1;
			}
			else {
				res[i]=stack.peek();
			}
			stack.push(arr[i]);
		}
		return res;
	}
	public static void main(String[]args) {
		int arr[] = {4,12,5,3,1,2,5,3,1,2,4,6};
		int result[] =greaterEle(arr);
		System.out.println("orginal array:" + Arrays.toString(arr));
		System.out.println("resulted array:" +Arrays.toString(result));
		
	}
}
