package com.opt.demo;

public class VehicleInheritance {

	 protected String brand = "Ford";        // Vehicle attribute
	  public void honk() {                    // Vehicle method
	    System.out.println("Tuut, tuut!");
	  }
} 
	  class Car extends VehicleInheritance {
		  private String modelName = "Mustang";    // Car attribute
		  public static void main(String[] args) {

		    // Create a myCar object
		    Car myCar = new Car();
		    myCar.honk();
		    System.out.println(myCar.brand + " " + myCar.modelName);
		  }
}
