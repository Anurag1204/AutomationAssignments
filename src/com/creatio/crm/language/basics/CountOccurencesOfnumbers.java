package com.creatio.crm.language.basics;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfnumbers {

	public static void main(String[] args) {
		
		int[] arr = {10,20,20,10,10,20,5,20};
		
		Map<Integer,Integer> hmap = new HashMap<>();
		
		for(int i: arr) {
			if(hmap.containsKey(i)) {
				int count = hmap.get(i);
				hmap.put(i, ++count);
			}
			
			else
				hmap.put(i, 1);
		}
		
		System.out.println(hmap);
		
		

	}

}
