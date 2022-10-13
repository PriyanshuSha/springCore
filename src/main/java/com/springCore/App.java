package com.springCore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("springFile.xml");
    	school school = (school)ac.getBean(school.class);
    	school.greeting();   
    	}
}
