package com.revature.singleton;

public class SingletonExample {

	private static SingletonExample singletonInstance;

	private SingletonExample() {

	}

	public static SingletonExample getSingletonInstance() {
		if (singletonInstance == null) {
			singletonInstance = new SingletonExample();
		}
		return singletonInstance;
	}

}
