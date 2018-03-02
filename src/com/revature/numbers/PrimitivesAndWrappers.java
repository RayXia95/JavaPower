package com.revature.numbers;

public class PrimitivesAndWrappers {

	public void primitivesTesting() {

		// Know primitives is important for OCA

		// One bit (0-1) [DO NOT USE 1 OR 0]
		boolean bo = true;

		// Signed primitives , 2^8 -> max 127
		// 8 bits.
		byte b = 5;

		// Signed, 2^16 -> max positive 32767
		short s = 32767;

		/*
		 * Unsigned, 2^16 -> max value 65535 if you use a number for a char, it
		 * is going to be the ASCII representation of it. Behind the scenes, a
		 * char is an int of a different kind.
		 */
		char c = 6;
		c = 's';

		System.out.println("Value of char: " + c);

		/* Signed, 2^32 -> max positive value is 4 gigabytes
		 * 
		 * A literal number, is automatically an int if it has no decimals
		 */
		int i = 424712947;

		// Signed, 2^64 -> max value is in the order of quintliions
		// interesting fact: 2^62~ weight of earth
		long l = 500L;

		/*
		 * signed, 2^32 including decimal part.
		 * you can declare literal floats with 'f'
		 * you need the f to complie
		 */
		float f = 20.4f;

		/*
		 * Signed, 2^64 including demical part.
		 * Any decimal literal is considered a double.
		 */
		double d = 50.4;

		/*
		 * let's paly around assigning them to each other
		 */
		// b = i; doesn't work!
		i = b;
		i = s;
		i = c;
		// i = l; doesn't work
		// i = d; doesn't work
		// i = f; doesn't work

		d = i;
		f = i;
		// f = d; doesn't work
		d = f;

		// i = bo; No such thing as this.

		/**
		 * Wrapper classes are the OBJECT representation of primitives.
		 * 
		 * They are useful because now we have methods that we can execute to
		 * meet our needs.
		 * 
		 * Knowing the basics of wrappers is important for OCA.
		 * 
		 * Wapper claases are immutable in java.
		 * 
		 * Wrappers extend the Number Abstract class.
		 * 
		 * And immutable class (OCP):
		 * 
		 * 1) Has a final value.
		 * 
		 * 2) The actual class is final.
		 * 
		 * 3) There is no setters, you can only initialize the value through
		 * overloaded constructor
		 */

		/**
		 * You can assign primitives directly to wrapper classes 
		 * -> BECAUSE of AUTOBOXING.
		 * 
		 * Behind the scenes what happens is: 
		 * -> new Integer(i) -> new WhicheverWrapper(primitiveValue)
		 *  -> It's encapsulating, wrapping the values
		 */
		// Study the boolean constructors for OCA
		Boolean booleanObject = bo;
		Byte byteObject = b;
		Short shortObject = s;
		// Character name is the only one that changes.
		Character charObject = c;
		Integer integerObject = i;
		Long longObject = l;
		Float floatObject = f;
		Double doubleObject = d;

		/**
		 * We can assign wrapper objects directly into primitives. This is
		 * called UNBOXINNG
		 * 
		 * -> behind the scnes is calling a wrapper method to return the
		 * primitives value.
		 */
		int primitives = integerObject;
	}

	public static void main(String[] args) {
		new PrimitivesAndWrappers().primitivesTesting();
	}
}
