package com.opt.demo;

    interface Print{
//	void print(String message);
	int operate( int a,int b);
}

    public class Lambdas {
	public static void printResults(int y) {
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Print myPrinter= x -> System.out.println(x);
//		myPrinter.print("Hello Lambdas");
		
		Print add = (a,b) -> {
			return a+b;
		};
		printResults(add.operate(5, 5));
	}

}

/* Lambda Syntax:Lambda expression consist of 3 entities
 *  1)Argument List(a,b)
 *  2)Arrow token ->
 *  3)Body{}
 *  (parameters) -> expression
 *  Ex:(x,y) -> x+y
 *  (parameters) -> { statements;}
 */
 
//
//    interface  Print {
//    void print(String message);
//    }
//
//    public class Lambdas {
//    public static void main(String args[]) {
//        //using nested class
//        Print myNestedPrinter = new Print(){
//            public void print(String x) {
//                System.out.println(x);
//            }
//        };
//        
//        //using lambda
//        Print myPrinter = x -> System.out.println(x);
//
//        myNestedPrinter.print("Hello nested classes");
//        myPrinter.print("Hello lambdas!");
//    }
//}
// 

