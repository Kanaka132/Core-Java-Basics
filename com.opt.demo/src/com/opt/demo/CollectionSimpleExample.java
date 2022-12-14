package com.opt.demo;

import java.util.ArrayList;
import java.util.List;

public class CollectionSimpleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myList = new ArrayList<String>();
		
		myList.add("hello");
		myList.add("World");
		
		for(String item : myList)
			System.out.println(item);
	}

}
