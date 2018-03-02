package com.revature.strings;

public class StringMethods {

	public void playingWithStrings(String s) {
		System.out.println("Original String:");
		System.out.println(s);

		System.out.println("TRIM: ");
		System.out.println(s.trim());

		System.out.println("Char at: ");
		System.out.println(s.charAt(2));

		System.out.println("Index of W ");
		System.out.println(s.indexOf('W'));

		System.out.println("Substring: "); // the end is not inclusive
		System.out.println(s.substring(s.indexOf('W'), 9));

		// String methods chaining
		System.out.println(s.trim().charAt(0));

		System.out.println(s.trim().toUpperCase().replace('W', 'J'));
	}

	public static void main(String[] args) {
		new StringMethods().playingWithStrings("  Welcome to the java. ");
	}
}
