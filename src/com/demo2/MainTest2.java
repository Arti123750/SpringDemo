package com.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new FileSystemXmlApplicationContext("C:Users/OM SAI RAM/Desktop/Bean3.xml");
		
		Animal a1=(Animal) context.getBean("anm");
		
		System.out.println("Four Leg Animal: "+a1.getFour_Legs());
		System.out.println("Two leg Animal: "+a1.getTwo_Legs());
		
	}
}
