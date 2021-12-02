package com.donnu.demo.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("employeeBean")
public class Employee {

    private Pet pet;
    private Car car;
    @Value("${employee.name}")
    private String name;
    @Value("${employee.age}")
    private int age;

//    @Autowired
    public Employee(Pet pet, Car car) { //public Employee(@Qualifier("dogBean") Pet pet, Car car)
        this.car = car;
        this.pet = pet;
        System.out.println("Employee Object: constructor");
    }

    public void init() {
        System.out.println("Employee Object: init method");
    }

    public void destroy() {
        System.out.println("Employee Object: destroy method");
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Employee Object: setAge method");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Employee Object: setName method");
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setPet(Pet pet){
        this.pet = pet;
        System.out.println("Employee Object: setPet method");
    }

    public void setCar(Car car) {
        this.car = car;
        System.out.println("Employee Object: setCar method");
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
