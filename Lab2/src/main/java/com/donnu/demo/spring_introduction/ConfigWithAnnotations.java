package com.donnu.demo.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Employee emp = context.getBean("employeeBean", Employee.class);
        emp.callYourPet();
        emp.colorOfYourCar();

        System.out.println(emp.getAge() + "\n" + emp.getName());

        context.close();
    }
}
