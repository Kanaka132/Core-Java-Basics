package com.opt.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionSamp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> hashStrings = new HashSet<String>();
		hashStrings.add("hello");
		hashStrings.add("world");
		
		List<String>arrayStrings = new ArrayList<String>(hashStrings);
		
		System.out.println(arrayStrings.size());
		System.out.println(arrayStrings.isEmpty());
		System.out.println(arrayStrings.contains("hello"));
		System.out.println(arrayStrings.contains("hi"));
		System.out.println(arrayStrings.add("another string"));
		System.out.println(arrayStrings);
		System.out.println(arrayStrings.removeAll(hashStrings));
		System.out.println(arrayStrings);
		for(String item:arrayStrings)
			System.out.print(item);
	}

}
