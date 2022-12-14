package com.opt.demo;

abstract class AnimalAbst {
	 public abstract void animalSound();
	 public void sleep() {
		    System.out.println("Zzz");
	 }
}

class Cat extends AnimalAbst{
	 public void animalSound() {
		 System.out.println("The cat say:meow meow");
	 }
}



class Abc {
	  public static void main(String[] args) {
	    Cat cat = new Cat(); // Create a Pig object
	    cat.animalSound();
	    cat.sleep();
	  }
	}

