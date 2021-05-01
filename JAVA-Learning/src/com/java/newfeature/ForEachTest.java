package com.java.newfeature;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ForEachTest {
	public static void main(String[] args) {

		ArrayList ls = new ArrayList();

		for (int i = 0; i < 100; i++) {
			ls.add(i);

		}

		// ls.forEach(System.out::println);
		//ls.forEach(i -> System.out.println("number: " + i));
		
		
		
		Stream strm=ls.parallelStream();
		//strm.filter(i ->  i> 90);
		
		
		
		
		//Demotest.meth1();
		
		Demotest dm=(a,b,c) ->{
			return a+b+c;
		};
		//dm.display();
int sum=dm.add(1, 4,0);
//System.out.println(sum);
	}



}

interface Demotest{
	
	default void display() {
		System.out.println("i am deafault");
	}
	
	
	static void meth1() {
		System.out.println("i am in static method");
	}
	
	
	
	int add(int a,  int b, int c);
	
	
	
	
}