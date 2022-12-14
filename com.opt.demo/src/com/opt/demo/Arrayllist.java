package com.opt.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arrayllist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating arraylist
		List<String>list=new ArrayList<String>();
		
		//adding object in arraylist
		list.add("raju");
		list.add("jaggu");
		
		//traversing list through iterator
		Iterator ir=list.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
