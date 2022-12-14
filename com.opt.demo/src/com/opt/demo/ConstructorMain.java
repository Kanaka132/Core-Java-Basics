package com.opt.demo;

public class ConstructorMain {
	int modelYear;
	String modelName;
	
	public ConstructorMain(int year,String name) {
		modelYear=year;
		modelName=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorMain obj=new ConstructorMain(1969, "Mustang");
		System.out.println(obj.modelYear+" "+obj.modelName);
	}

}
