package com.revature.scopes;

public class Scopes {

	/**
	 * Class (static) scope
	 */
	private static int i;

	private static void myMethod() {
		System.out.println("Welcome to the static scope");

		// local
		if (i > 0) {
			String localVar = "";
		}

		{
			String localVar = "";
		}

	}

	/**
	 * Instance (Objet) scope
	 */

	private String aNumber;

	/**
	 * Method or parameter scope
	 * Java is passby value
	 */
	private void methodScopePrimitive(int i) {
		i = 7;
	}

	private void methodScopeObject(int i[]) {
		i[2] = 32767;
	}

	public static void main(String[] args) {
		Scopes.myMethod();
		System.out.println(Scopes.i);
		// System.out.println(aNumber); doesnt work need an instance of class
		System.out.println(new Scopes().aNumber);

		int anotherInt = 5;
		new Scopes().methodScopePrimitive(anotherInt);
		System.out.println(anotherInt);

		int[] anArray = { 1, 2, 3, 4 };
		new Scopes().methodScopeObject(anArray);
		for (int i : anArray) {
			System.out.print(i + ",");
		}
	}
}
