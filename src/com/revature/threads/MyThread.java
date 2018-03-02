package com.revature.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " : " + i);
			// This is the same as btu more specific. gotten through inheritance
			// System.out.println(super.getName() + " : " + i);
		}
	}
}
