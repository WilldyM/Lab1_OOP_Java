package com.donnu.demo.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Employee emp = context.getBean("employeeBean", Employee.class);
        emp.callYourPet();

        context.close();
    }
}
