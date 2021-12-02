package com.donnu.demo.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
//@Scope("prototype")
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bean was created");
    }

    @Override
    public void say(){
        System.out.println("Gav-gav");
    }

    @Override
    @PostConstruct
    public void init() {
        System.out.println("Class Dog: init method");
    }

    @Override
    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
