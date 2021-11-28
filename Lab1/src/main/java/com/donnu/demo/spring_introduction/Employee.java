package com.donnu.demo.spring_introduction;

public class Employee {
    private Pet pet;
    private Car car;
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setPet(Pet pet){
        this.pet = pet;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void callYourPet(){
        System.out.println("Hey!");
        this.pet.say();
    }

    public void colorOfYourCar() {
        System.out.println("Car color:");
        this.car.getColor();
    }
}
