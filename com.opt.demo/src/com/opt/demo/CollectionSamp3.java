package com.opt.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionSamp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Iterating over collections using for-each
		List<String> arrayStrings=new ArrayList<String>();
		arrayStrings.add("hello");
		arrayStrings.add("goodbye");
//		for(String item : arrayStrings)
//			System.out.println(item);
		
		//Using an Iterator to loop
		for(Iterator<String> it=arrayStrings.iterator();it.hasNext();)//hasNext method returns true if the iterator has more elements
			if(it.next() !="hello")
				it.remove();
//		System.out.print(arrayStrings);
		//iterator can be used when we want to remove elements
		
		
		//using streams to loop
		arrayStrings.stream()
		.filter(s -> s!="goodbye")
		.forEach(s -> System.out.println(s));
	}

}
