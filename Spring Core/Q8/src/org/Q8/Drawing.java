package org.Q8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		context.registerShutdownHook();
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
	
		
}