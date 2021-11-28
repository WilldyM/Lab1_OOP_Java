package com.donnu.demo.spring_introduction;

public class Audi implements Car {
    private final String color;

    public Audi(String color) {
        this.color = color;
    }

    @Override
    public void getColor() {
        System.out.println(this.color);
    }
}
