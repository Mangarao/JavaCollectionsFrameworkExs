package com.deloitte.p1;

import java.util.Comparator;

public class EmpIdComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		if(e1.getId()==e2.getId()) {
			return 0;
		}else if(e1.getId()<e2.getId()) {
			return 1;
		}else {
			return -1;
		}
		
		
	}

}
