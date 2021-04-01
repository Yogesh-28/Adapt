package org.Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Question1 ques1 = (Question1)context.getBean("ques1");
		ques1.detail();
		
		Question2 ques2 = (Question2)context.getBean("ques2");
		ques2.detail();
		
		Question3 ques3 = (Question3)context.getBean("ques3");
		ques3.detail();
		
	}
}