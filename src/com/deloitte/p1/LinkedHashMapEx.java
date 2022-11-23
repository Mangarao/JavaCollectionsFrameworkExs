package com.deloitte.p1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapEx {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
		hashMap.put(105, "Manga");
		hashMap.put(101, "Manga");
		hashMap.put(101, "Kohli");
		hashMap.put(102, "Dhoni");
		hashMap.put(104, "Manga");
		//Keys are always unique
		//Duplicate values are allowed
		System.out.println(hashMap);
		
		for (Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
	}

}
