package com.opt.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	// filtering collection without using stream
	int id;
	String name;
	float price;

	public Streams(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		List<Streams> productList = new ArrayList<Streams>();
		productList.add(new Streams(1, "Iphone", 105000));
		productList.add(new Streams(2, "Samsung", 95000));
		productList.add(new Streams(3, "Oppo", 65000));
		List<Float> productPriceList = new ArrayList<Float>();
		for (Streams product : productList) {

			// filtering data of list
			if (product.price < 105000) {
				productPriceList.add(product.price);
			}
		}
		System.out.println(productPriceList);

		// 1)using stream
		List<Float> productPriceList2 = productList.stream()
				.filter(p -> p.price > 60000)// filtering data
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList2);
		
		 //2)using double colon operator
//		Stream<String> stream=Stream.of("hello","world","welcome","to","stream","concept");
////		stream.forEach(s -> System.out.println(s));
//		stream.forEach(System.out::println); //using double colon operator
		
		//3)Stream Iterating
		Stream.iterate(1, element -> element + 1)
		.filter(element -> element % 5==0)
		.limit(8)
		.forEach(System.out::println);
		
		//4)Filtering and Iterating
		productList.stream()
		.filter(Streams -> Streams.price==65000)
		.forEach(Streams -> System.out.println(Streams.name));
		
		//5)reduce method
         float totalPrice2 = productList.stream()  
             .map(Streams->Streams.price)  
             .reduce(0.0f,Float::sum);  
             System.out.println(totalPrice2);  
             
        //6)using  collector
             double totalPrice3 = productList.stream()  
                   .collect(Collectors.summingDouble(product->product.price));  
              System.out.println(totalPrice3);  
             
        //7)Count method
              long count = productList.stream()  
                      .filter(product->product.price>60000)  
                      .count();
              System.out.println(count);  
              long count1 = productList.stream()  
                      .filter(product->product.price<60000)  
                      .count();
              System.out.println(count1); 
	}

}
