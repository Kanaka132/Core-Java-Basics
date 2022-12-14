package com.opt.demo;

public class MainCar {

	public void fullThrottle() {
		System.out.println("The car is going as fast as it can");
	}
	
	public void speed(int maxSpeed) {
		System.out.println("Max speed is:"+maxSpeed);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainCar myCar=new MainCar();
		myCar.fullThrottle();
		myCar.speed(200);
	}

}
