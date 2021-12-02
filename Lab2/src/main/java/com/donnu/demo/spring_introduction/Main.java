package com.donnu.demo.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee1 = context.getBean("employee1", Employee.class);

        System.out.println(String.format("Name: %s", employee1.getName()));
        System.out.println(String.format("Age: %s\n", employee1.getAge()));

        System.out.println("@Calling my pet@");
        employee1.callYourPet();
        System.out.println();

        employee1.colorOfYourCar();
    }
}
