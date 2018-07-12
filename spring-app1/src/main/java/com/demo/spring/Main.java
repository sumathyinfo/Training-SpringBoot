package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		Mail mail = (Mail) ctx.getBean("mail");
		System.out.println(mail.getMessage().getBody());
		mail.getMessage().setBody("Override");
		
		Mail mail1 = (Mail) ctx.getBean("mail");
		System.out.println(mail1.getMessage().getBody());
		
		System.out.println("are the bean same : " + (mail.getMessage()==mail1.getMessage()));
		
	}

}