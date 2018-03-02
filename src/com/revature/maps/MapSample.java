package com.revature.maps;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

	public void interateMap(Map<Integer, String> map) {
		/*
		 * We can iterate:
		 */

		// By the key
		System.out.println("By the key: ");
		for (Integer key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}

		// By the values
		System.out.println("By the value");
		for (String value : map.values()) {
			System.out.println(value);
		}

		System.out.println("By entry-set");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		/**
		 * There is no add(object) method, we use put(Key, Value) for maps
		 */

		/**
		 * Note that put replaces the value if the key exists
		 */

		map.put(1, "Peter");
		map.put(1, "Petronilo");
		map.put(2, "Robert");
		map.put(3, "Bob");
		map.put(4, "Edward");
		map.put(5, "Parker");
		map.put(6, "Carlos");
		map.put(523, "awsd");
		map.put(5343332, "cat");
		map.put(65756765, "red");
		map.put(null, "yes");

		new MapSample().interateMap(map);

		// map = new Hashtable<>();
		// map.put(null, "yes");
		// map.put(5, null);
	}
}
