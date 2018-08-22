package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test01 {

	public static void displayName(Collection<?> collection) {
		for (Object object : collection) {
			System.out.println(object);
		}
	}
	
	
	public static void main(String[] args) {

		List<String> strings = new ArrayList<String>();
		strings.add("hello");
		strings.add("temp");
		strings.add("xieqh");
		displayName(strings);
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(123);
		integers.add(456);
		integers.add(789);
		displayName(integers);
	}

}
