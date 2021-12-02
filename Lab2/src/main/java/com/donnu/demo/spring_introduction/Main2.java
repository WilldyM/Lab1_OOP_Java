package com.donnu.demo.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Employee emp = context.getBean("employeeBean", Employee.class);
        emp.callYourPet();
        emp.colorOfYourCar();

        System.out.println(emp.getAge() + "\n" + emp.getName());

        context.close();
    }
}
