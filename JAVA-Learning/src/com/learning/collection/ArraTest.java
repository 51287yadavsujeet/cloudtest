package com.learning.collection;


import java.util.ArrayList;
import java.util.List;

public class ArraTest {
	public static void main(String[] args) {


		List ls =new ArrayList();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(4);
		ls.add(4);
		
//		ls.add(1, "B");
//		ls.add(1, "C");
//		ls.add(1, "D");
//			}
	
		System.out.println(ls.toString());
		ls.add(4,"SUJEET");
		System.out.println(ls.toString());
		System.out.println(ls.get(4));
	}
}
