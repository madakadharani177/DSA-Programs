package com.DSA.Stack;

import java.util.Stack;

public class Stackexmp1 {
		Stack<Integer> mainstack = new Stack<>();
		Stack<Integer> minstack = new Stack<>();
		
		//Insert operation
		public void pushing(int val) {
			mainstack.push(val);
			if(minstack.isEmpty() || val<=minstack.peek()) {
				minstack.push(val);
			}
		}
		//removing operation
		public void popping() {
			if(mainstack.peek().equals(minstack.peek())) {
				minstack.pop();
			}
			mainstack.pop();
		}
		//returns the top element
		public int topEle() {
			return mainstack.peek();
		}
		//get min value
		public int getMin() {
			return minstack.peek();
		}
		public static void main(String[] args) {
			Stackexmp1 sk = new Stackexmp1();
			sk.pushing(5);
			sk.pushing(-2);
			sk.pushing(0);
			sk.pushing(-3);
			System.out.println(sk.topEle());
			System.out.println(sk.getMin());
			sk.popping();
			System.out.println(sk.topEle());
			System.out.println(sk.getMin());
		}
}
