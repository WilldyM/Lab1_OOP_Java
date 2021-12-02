package com.donnu.demo.spring_introduction;

public interface Car {
    public void init();
    public void destroy();
    private void toDrive() {
        System.out.println("Driving..");
    }
    public void setColor(String color);
    public void getColor();
}
