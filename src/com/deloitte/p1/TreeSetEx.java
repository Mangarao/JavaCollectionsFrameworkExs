package com.deloitte.p1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> hashSet = new TreeSet<>();
		hashSet.add("Manga");
		hashSet.add("Dhoni");
		hashSet.add("Dhoni");
		hashSet.add("Kohli");
		hashSet.add(null);
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
