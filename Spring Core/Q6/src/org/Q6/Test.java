package org.Q6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        dbConfig dbconfig= (dbConfig)context.getBean("dbConfig");
        dbconfig.detail();
    }

}