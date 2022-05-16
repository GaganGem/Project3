package com.rays.project3.model;

import java.util.Stack;

public class Stackkkkk {
	public static void main(String[] args) {

		Stack s1 = new Stack();
		Stack s2 = new Stack();

		for (int i = 1; i <= 50; i++) {
			s1.push(i);
		}

		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		System.out.println(s2);
	}

}
