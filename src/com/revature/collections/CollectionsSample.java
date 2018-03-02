package com.revature.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSample {

	public void listSample(IceCream... creams) {
		List<IceCream> list = new ArrayList<>();

		for (IceCream iceCream : creams) {
			list.add(iceCream);
		}

		// Extra
		List<IceCream> differentWay = Arrays.asList(creams);

		System.out.println("Regular for loop List");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Enhanced for loop List");
		for (IceCream iceCream : creams) {
			System.out.println(iceCream);
		}

		System.out.println("Iterator: ");
		Iterator<IceCream> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

	public void hashSetSample(IceCream... creams) {
		Set<IceCream> set = new HashSet<IceCream>();

		for (IceCream iceCream : creams) {
			set.add(iceCream);
		}

		/**
		 * Not that order is not Guaranteed in this case,
		 * and to guarentee uniqueness, the POJO must override
		 * hashCode and equals() (BOTH!!)
		 * 
		 * remember: == hashCode() -> equals()
		 */
		System.out.println("HashSet");
		// will check hashcode and equals
		for (IceCream iceCream : set) {
			System.out.println(iceCream);
		}
	}

	public Set<IceCream> sorting(IceCream... creams) {
		// only by equals for sorted sets
		Set<IceCream> set = new TreeSet<>();

		for (IceCream iceCream : creams) {
			set.add(iceCream);
		}
		return set;
	}

	public Set<IceCream> sortingComparator(IceCream... creams) {
		Set<IceCream> set = new TreeSet<>(new BrandComparator());
		/*Set<IceCream> set = new TreeSet<IceCream>((IceCream i1, IceCream i2) -> {
			return i1.getBrand().compareTo(i2.getBrand())
		});*/

		for (IceCream iceCream : creams) {
			set.add(iceCream);
		}
		return set;
	}

	public static void main(String[] args) {
		IceCream[] creams = { new IceCream("Chocolate", "Magum", 200), new IceCream("Chocolate", "Ben & Jerry's", 200),
		        new IceCream("Vanilla", "Haagen Daas", 150), new IceCream("Strawberry", "Turkey Hill", 100),
		        new IceCream("Strawberry", "Turkey Hill", 100), new IceCream("Strawberry", "Turkey Hill", 100),
		        new IceCream("Strawberry", "Turkey Hill", 100), new IceCream("Strawberry", "Turkey Hill", 100),
		        new IceCream("Strawberry", "Turkey Hill", 100), new IceCream("Strawberry", "Turkey Hill", 100) };

		new CollectionsSample().listSample(creams);
		new CollectionsSample().hashSetSample(creams);

		/**
		 * Not that even without hashCode and equalsm sorted sets
		 * will remove duplicate elements depending on what attribute
		 * you are sorting (we have 3 unique flaor, and 4 unique brand);
		 */

		/*
		 * sorted set works b keys that is why it still removes duplicates.
		 */
		System.out.println("Sorting: ");
		System.out.println(new CollectionsSample().sorting(creams));
		System.out.println("Sorting Brand Comparator: ");
		System.out.println(new CollectionsSample().sortingComparator(creams));
		// comment hashCode()
	}

}
