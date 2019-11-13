package com.demo1;

import org.springframework.beans.factory.BeanFactory;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory context=new ClassPathXmlApplicationContext("Benas1.xml");
		Shape s1=(Shape) context.getBean("shapeinfo");
		
		System.out.println("Height: "+s1.getHeight());
		System.out.println("Width: "+s1.getWidth());
		
		
	}

}
