package com.revature.strings;

public class BufferAndBuilder {

	public void playingWithBuilder(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.append("a");
		sb.append("J");
		sb.reverse();

		System.out.println(sb);
		sb = new StringBuilder(s);
		System.out.println(sb.append("a").append("J").reverse());
	}

	public static void main(String[] args) {
		new BufferAndBuilder().playingWithBuilder("av");
	}
}
