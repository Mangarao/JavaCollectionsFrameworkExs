package com.deloitte.p1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> v = new LinkedList();
		v.add("Manga");
		v.add("Kohli");
		v.add("Dhoni");
		v.add("Dhoni");
		
		System.out.println(v);

	
		System.out.println("Iteration using Iterator");
		Iterator<String> i = v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
