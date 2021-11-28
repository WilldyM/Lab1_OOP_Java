package com.donnu.demo.spring_introduction;

public class Toyota implements Car {
    private final String color;

    public Toyota(String color) {
        this.color = color;
    }

    @Override
    public void getColor() {
        System.out.println(this.color);
    }
}
