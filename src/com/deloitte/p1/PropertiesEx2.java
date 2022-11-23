package com.deloitte.p1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx2 {
	public static void main(String[] args) {
		Properties p=new  Properties();
		try {
			FileReader reader = new FileReader("database.properties");
			p.load(reader);
			System.out.println("User value: "+p.getProperty("user"));
			System.out.println("password value: "+p.getProperty("password"));
			System.out.println("url value: "+p.getProperty("url"));
		} catch (FileNotFoundException e) {
			System.err.println("The file not present");
			return;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
