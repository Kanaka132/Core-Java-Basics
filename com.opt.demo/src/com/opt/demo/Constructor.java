package com.opt.demo;

public class Constructor {
	int x;
	

	public Constructor(int y) {
		 x=y;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor obj=new Constructor(5);
		System.out.println(obj.x);
	}

}
