package com.deloitte.p1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>(10);
		v.add("Manga");
		v.add("Kohli");
		v.add("Dhoni");
		v.add("Dhoni");
		
		System.out.println(v);

		System.out.println("Iteration using Enumeration");
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("Iteration using Iterator");
		Iterator<String> i = v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
