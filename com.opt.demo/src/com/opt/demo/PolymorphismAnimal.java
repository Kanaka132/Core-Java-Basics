package com.opt.demo;

 class PolymorphismAnimal {

	 void animalSound() {
		 System.out.println("The animal makes a sound");
	 }
	
	 class Dog extends PolymorphismAnimal{
		 void animalSound() {
			 System.out.println("The dog say:bow bow");
		 }
	 }
	 
	 class Cat extends PolymorphismAnimal{
		 void animalSound() {
			 System.out.println("The cat say:meow meow");
		 }
	 }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PolymorphismAnimal obj=new PolymorphismAnimal();
//		PolymorphismAnimal obj1;
//	     obj1= new Cat();
//		obj.animalSound();
		obj.animalSound();
	}
	 }



