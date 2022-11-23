package com.deloitte.p1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet<String> hashSet = new LinkedHashSet<>();
		hashSet.add("Manga");
		hashSet.add("Dhoni");
		hashSet.add("Dhoni");
		hashSet.add("Kohli");
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
