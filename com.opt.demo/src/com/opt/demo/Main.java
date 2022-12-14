package com.opt.demo;

public class Main {
	
	int x=5;
//	final int x=5;
	int y=10;
	String fname="John";
	String lname="Mick";
	int age=22;

	
	
	public static void main(String[] args) {
		
		Main myobj1=new Main();
		Main myobj2=new Main();
		myobj2.x=55;
//		myobj1.x=40;
//		System.out.println(myobj1.y);
		System.out.println(myobj1.x);
		System.out.println(myobj2.x);
		System.out.println("my fname is :"+myobj1.fname);
		System.out.println("my lname is:"+myobj1.lname);
		System.out.print("Age is:"+myobj1.age);

	}

}
