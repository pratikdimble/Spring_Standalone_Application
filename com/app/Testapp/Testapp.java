package com.app.TestApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/app/cfg/config.xml");
			Object ob1=ctx.getBean("empobj");
			Object ob2=ctx.getBean("compobj");
			System.out.println("\n\t***\t"+ob1);
			System.out.println("\n\t***\t"+ob2);
	}

}
