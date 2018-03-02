// import java.util.List; // -> this will break the class.
// package must be the first line

package com.revature.imports;

import static java.lang.Integer.MAX_VALUE;

import java.util.AbstractList;
//import java.util.*; bad practice
import java.util.List;

public class Importing {
	List<?> l;
	AbstractList<?> al;

	int i = MAX_VALUE;
	float f = Float.MAX_VALUE; // I dont want to do this
}
