package com.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans4.xml");
		
		Bottle b1=(Bottle) context.getBean("binfo");
		Bottle b2=(Bottle) context.getBean("binfo");
		 b1.setSize(25);
		 b1.setColour("Blue");
		 b1.setCompany("Steelcase");
		 
		 b2.setSize(18);
		 b2.setColour("Gray");
		 b2.setCompany("Meltone");
		 
		System.out.println("Bottle Size: "+b1.getSize());
		System.out.println("Bottle Colour: "+b1.getColour());
		System.out.println("Bottle Company: "+b1.getCompany());
		System.out.println();
		System.out.println("Bottle Size: "+b2.getSize());
		System.out.println("Bottle Colour: "+b2.getColour());
		System.out.println("Bottle Company: "+b2.getCompany());


	}

}
