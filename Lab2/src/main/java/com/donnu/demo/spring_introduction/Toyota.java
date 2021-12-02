package com.donnu.demo.spring_introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("toyotaBean")
public class Toyota implements Car {
    @Value("${toyota.color}")
    private String color;

    public Toyota() {
        System.out.println("Toyota Object: constructor");
    }

    @Override
    public void init() {
        System.out.println("Toyota Object: init method");
    }

    @Override
    public void destroy() {
        System.out.println("Toyota Object: destroy method");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void getColor() {
        System.out.println(this.color);
    }
}
