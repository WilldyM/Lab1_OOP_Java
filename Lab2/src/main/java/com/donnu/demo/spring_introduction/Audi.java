package com.donnu.demo.spring_introduction;

public class Audi implements Car {
    private String color;

    public Audi() {
        System.out.println("Audi Object: constructor");
    }

    @Override
    public void init() {
        System.out.println("Audi Object: init method");
    }

    @Override
    public void destroy() {
        System.out.println("Audi Object: destroy method");
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
