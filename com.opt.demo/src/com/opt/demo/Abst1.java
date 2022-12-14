package com.opt.demo;

//abstract class
abstract class Abst1 {
	public String fname="John";
	public int age=24;
	
	public abstract void study();//abstract method
	
	//Subclass (inherit from Abst1)
	class Student extends Abst1{

		public int gradYear=2018;
		public void study() {
			System.out.println("studying");
		}
	}

}
