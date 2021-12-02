package com.donnu.demo.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);

//        myDog.setName("belka");
//        yourDog.setName("strelka");
//
//        System.out.println("Переменные ссылаются на один объект? " + (myDog==yourDog));
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());

        context.close();
    }
}
