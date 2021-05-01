package com.learning.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrasCount {
	public static void main(String[] args) {
		List ls =new ArrayList();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(4);
		ls.add(4);
		ls.add("SUJEET");
		//System.out.println("LIST-"+"-"+ls.toString());
		
		/*
		 * int occ=Collections.frequency(ls,4 ); System.out.println(occ);
		 */

		/*
		 * Map<String, Long> counts =(Map<String, Long>)
		 * ls.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		 * 
		 * System.out.println(counts);
		 */
		/*
		 * Map<String, Long> couterMap = (Map<String, Long>)
		 * ls.stream().collect(Collectors.groupingBy(e ->
		 * e.toString(),Collectors.counting())); System.out.println(couterMap);
		 */
	
		
	
		
		
		
	}

}
