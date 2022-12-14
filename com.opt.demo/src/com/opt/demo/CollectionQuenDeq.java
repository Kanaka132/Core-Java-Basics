package com.opt.demo;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionQuenDeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Queue<Character> myQueue = new LinkedList<Character>();
//		myQueue.add('a');
//		myQueue.add('b');
//		myQueue.add('c');
//		myQueue.add('d');
//
//		myQueue.add('e');
//		// adds 'f' to end of myQueue that is offer and add means same
//		myQueue.offer('f');
//		myQueue.remove();
//		// poll removes 'b'.remove and poll means same
//		myQueue.poll();
//		//element and peek return the first element in queue
//		myQueue.element();
//		myQueue.peek();
//		System.out.println(myQueue);

		Deque<Character> myDeque = new LinkedList<Character>();
		myDeque.add('a');
		myDeque.add('b');
		myDeque.add('c');
		myDeque.add('d');
		
		myDeque.addFirst('e');
		myDeque.offerLast('f');//add f at end
		myDeque.removeFirst();//removes e
		myDeque.pollLast(); //remove 'f'
	    myDeque.getFirst();//returns 'a'
	    myDeque.peekLast(); //returns 'd'
	    System.out.println(myDeque);
	    myDeque.removeFirstOccurrence('b');//removes first occurrence of 'b'
	    System.out.println(myDeque);
	       
	}

}
