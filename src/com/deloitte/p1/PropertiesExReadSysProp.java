package com.deloitte.p1;

import java.util.Properties;
import java.util.Map.Entry;

public class PropertiesExReadSysProp {
	
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		for (Entry entry : properties.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
	}

}
