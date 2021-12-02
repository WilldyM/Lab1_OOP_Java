package com.donnu.demo.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("catBean")
//@Scope("prototype")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean was created");
    }

    @Override
    public void say(){
        System.out.println("Meow-meow");
    }

    @Override
    public void init() {
        System.out.println("Cat Object: init method");
    }

    @Override
    public void destroy() {
        System.out.println("Cat Object: destroy method");
    }

}
