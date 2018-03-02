package com.revature.control;

/**
 * We are learning control statements.
 * 
 * Blue kind of comments are JavaDoc
 * 
 * Camel case for classes is the best practice for naming convention
 * 
 * Control Statements alter the flow of execution of our code
 * 
 * @author Raymond
 *
 */
public class Control {

	public void ifAndSwitch(int i) {
		/**
		 * All expression in an if statement need to evaluate into a boolean
		 * expression
		 * 
		 * No: 0,1,null.
		 * 
		 * Always provide curly braces
		 */
		if (i >= 5) {
			System.out.println("The value of i is more or equals to 5");
		} else if (i == 3) {
			System.out.println("The value of i is 3.");
		} else {
			System.out.println("The value of i is less than 3");
		}

		/**
		 * boolean, long, and double doesnt work with switch. only convertable
		 * to int works. (byte,short,char). String and enums
		 */
		byte b = 3;

		/**
		 * Be careful with break statements, if you don't use them,
		 *  your switch will cascade until next break.
		 * Similar to break, you can return (one or the other).
		 */
		switch (b) {
			case 5:
				System.out.println("Byte is 5");
				break;
			case 3:
				System.out.println("Byte is 3");
			case 7:
				System.out.println("Byte is 7");
				break;
			default:
				System.out.println("Default is checked.");
		}

		char c = '5';
		switch (c) {
			case 5:
				System.out.println("Char is 5");
				break;
			case '5':
				System.out.println("Char is the actual char '5' ");
				break;
		}
	}

	/**
	 * As other control statements, we have:
	 * break, continue, return (all of these can be used inside of loop construct)
	 * 
	 */
	public void looping() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			// Continue skips the loop ahead
		}

		// Infinite for loop
		// for(;;) {}

		/*
		 * You would use for looop over a while loop if you ned more complex
		 * expressions in one line.
		 */

		for (int i = 0; i < 10; System.out.println(i++)) {
			continue;
		}

		/*
		 *  You would use a while over a for loop when only a boolean expression
		 *  needs to be checked.
		 *  
		 */
		//		Daemon
		//		while(true)
		//		{
		//			
		//		}

		/*
		 * The only difference is taht this block will always execute at LEAST once. 
		 */
		//		do {
		//			// Do something
		//		}while(true);
	}

	/**
	 * Arithmetic: +,-,*,/,%,++,--.+=,-=,*=,/=,%=
	 * 
	 * Important for OCA: ++ and -- can be post or pre increment (i++ or ++i).
	 * 
	 * Relational: ==, !=, >,<,>=,<= (they evaluate to boolean)
	 * 
	 * Logical: &, | [Non short-circuit] <-> &&, || [short-circuit]
	 * 
	 * Ternary: (boolean) ? (if true) : (if false) {Right side must return a value (no voids)}
	 * 
	 * Bit-wise: >>, <<
	 */
	public void operators() {
		System.out.println("-> Operators");
		int i = 3;
		System.out.println(i++); // 3 [This is post-increment]
		System.out.println(++i); // 5 [prev value 4 preincrement]

		boolean b = true;

		/*
		 * If we use the non-short circuit, all the expression will be
		 * evaluated no matter the outcome.
		 * 
		 * If we use a SHORT-circuit operator, as soon as the expression is
		 * satisfied it will stop
		 */
		//		if (b | operatorHelper()) {
		//
		//		}
		if (b && operatorHelper()) {

		}

	}

	public boolean operatorHelper() {
		System.out.println("Im the helper");
		return true;
	}

	public String ternaryOperator(boolean b) {
		return (b ? "B is true" : "B is false");
		/**
		 * This would look like 
		 * if(b)
		 * 	return "B is true";
		 * else
		 * 	return "B is false";
		 */
	}

	/**
	 * try, catch, and finally is also a control 
	 */

	public static void main(String[] args) {
		/*
		 * Barebones instantiation of a Class
		 */

		new Control().ifAndSwitch(0);

		Control control = new Control();
		control.looping();
		control.operators();
		System.out.println(control.ternaryOperator(false));
	}
}
