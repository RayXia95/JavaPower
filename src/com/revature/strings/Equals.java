package com.revature.strings;

public class Equals {
	public void equalsTesting() {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");

		System.out.println(s1 == s2); // True, becayse they are both in the Heap (STRING POOL)
		System.out.println(s1 == s3); // False, they are different objects in the heap
		System.out.println(s1.equals(s3));

		Equals e1 = new Equals();
		Equals e2 = new Equals();
		Equals e3 = e2;
		System.out.println(e1.equals(e2)); // False, .equals is not implemented
		System.out.println(e2 == e3); // True, e3 is point to e2
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	public static void main(String[] args) {
		new Equals().equalsTesting();
	}
}
