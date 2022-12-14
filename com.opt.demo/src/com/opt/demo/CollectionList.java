package com.opt.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionList {

	//List Interface
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1)Positional access
		List<String>arrayStrings= new ArrayList<String>();
		arrayStrings.add("hello");
		arrayStrings.add("how are you");
		arrayStrings.add("goodbye");
		arrayStrings.add("hello");
		List<Character>arrayChars = new ArrayList<Character>();
		arrayChars.add('a');
		arrayChars.add('b');
		arrayChars.add('c');
		
//		//inserts element at position 1
//		arrayStrings.add(1,"hi");
//		System.out.println(arrayStrings);
//		
//		//removes element at position 0
//		arrayStrings.remove(0);
//		System.out.println(arrayStrings);
//		
//		arrayStrings.stream()
//		.forEach(s->System.out.println(s));
//		
//		//2)Search(a list can search for a specified object and returns numerical position)
//		System.out.println(arrayStrings.indexOf("hello"));
//		arrayStrings.lastIndexOf("hello");
//		System.out.println(arrayStrings.lastIndexOf("hello"));
		
		//3)Iteration
//		ListIterator<String> litr=arrayStrings.listIterator();
//		while(litr.hasNext()) {
//			System.out.println(litr.next());
//		}
//		while(litr.hasPrevious()) {
//			System.out.println(litr.previous());
//			litr.set("hi");
//		}
//		
//		arrayStrings.stream().forEach(System.out::println);
		
		//Range-view operations
		arrayChars.subList(0, 1).clear();//here a will be removed
		arrayChars.stream().forEach(System.out::println);
	}

}
