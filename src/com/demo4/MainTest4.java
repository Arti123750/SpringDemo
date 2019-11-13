package com.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest4 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean5.xml");
		Car c1=(Car) context.getBean("cinfo");
		Car c2=(Car) context.getBean("cinfo");
		c1.setCar_No(1122);
		c1.setCar_Name("BMW");
		
		c2.setCar_No(1596);
		c2.setCar_Name("Audi");
		
		System.out.println("Car no: "+c1.getCar_No());
		System.out.println("Car Name: "+c1.getCar_Name());
		System.out.println();
		System.out.println("Car no: "+c2.getCar_No());
		System.out.println("Car Name: "+c2.getCar_Name());
		
		
		

	}

}
