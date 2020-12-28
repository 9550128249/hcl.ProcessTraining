package org.hcl.maven3;
import org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");
	College1 e=context.getBean(College1.class);
	System.out.println(e.getCoursesoffered());
	}
}