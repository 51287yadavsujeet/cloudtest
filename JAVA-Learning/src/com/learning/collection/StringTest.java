package com.learning.collection;

public class StringTest {
	public static void main(String[] args) {
		String S1="sujeeet";
		String S2=" ";
	
	if(S1==S2) {
		System.out.println("true");
	}
	else {
		System.out.println(" i am unequal");
	}
	boolean it2=S1.equals(S2);
		System.out.println(it2);
	System.out.println(S1.hashCode());
	System.out.println(S2.hashCode());
	}

}
