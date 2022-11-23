package com.deloitte.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Manga", 455554);
		Employee e3 = new Employee(103, "Dhoni", 555554);
		Employee e2 = new Employee(102, "Kohli", 23554);
		ArrayList<Employee> al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println("Printing Emp Data in sorted order based on name");
		Collections.sort(al, new NameComparator());
		Iterator<Employee> listIterator = al.iterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("Printing Emp Data in sorted order based on EMP Id");
		Collections.sort(al, new EmpIdComparator());
		Iterator<Employee> listIterator1 = al.iterator();
		while (listIterator1.hasNext()) {
			System.out.println(listIterator1.next());
		}

		// sort the Employee objects based on Employee Id in ascending order
		// sort the employee objects based on Employee id in descending order
		// sort the employee objects based on Employee name

		/*
		 * System.out.println("Traverse the elements in Backward direction");
		 * while(listIterator.hasPrevious()) {
		 * System.out.println(listIterator.previous()); }
		 */
	}

}
