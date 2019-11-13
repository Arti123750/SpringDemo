package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Student s1 = (Student) context.getBean("sinfo");
		Teacher t1=(Teacher) context.getBean("tinfo");

		System.out.println("Student ID: " + s1.getS_ID());
		System.out.println("Student Name: " + s1.getS_Name());
		
		System.out.println();
		
		System.out.println("Teachet Id: "+t1.getT_ID());
		System.out.println("Teacher Name: "+t1.getT_Name());

	}

}
