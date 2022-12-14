package com.opt.demo;

public class Methods {
	
//	static void myMethod() {
//		System.out.println("Hello World");
//	}
	
	//Static Method
	static void myStaticMethod() {
		System.out.println("Static method can be called without creating objects");
	}
	
	//Public Method
	public void myPublicMethod() {
		System.out.println("public method must be called by creating objects");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		myMethod();
		myStaticMethod();
//		myPublicMethod(); this is giving an error
		
		Methods obj=new Methods();
		obj.myPublicMethod();
	}

}
