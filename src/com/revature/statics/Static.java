package com.revature.statics;

public class Static {
	static int i = 5; // 1
	int k = 7; // 3

	// 2
	static {
		System.out.println("Static Block " + i);
		System.out.println(new Static().k + i + " OCA " + i); // 12 OCA 5
		System.out.println(" OCA " + i + new Static().k);
	}

	// 4
	{
		System.out.println("Block " + k);
	}

	// OCA
	// public static void Main(String[] args) { // this is not a main method
	public static void main(String[] args) {
		String String = ""; // Possible, OCA

		new Static();
		new Static();
		new Static();

		// new Strin[]{}
		// to do it in command line
		// -> javac Static.java
		// -> java Static hello java you are awesome
		System.out.println(args); // This is 0 if no parameters.
		for (String s : args) {
			System.out.print(s + " ");
		}
	}
}
