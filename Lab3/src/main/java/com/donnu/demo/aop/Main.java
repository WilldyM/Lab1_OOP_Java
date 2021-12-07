package com.donnu.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Storage storage = context.getBean("storage", Storage.class);
        Toy toy = context.getBean("toy", Toy.class);
        toy.setName("Паровозик");
        Toy toy2 = context.getBean("toy", Toy.class);
        toy2.setName("Радиоуправляемый вертолетик");
        Car car = context.getBean("car", Car.class);
        Furniture furniture = context.getBean("furniture", Furniture.class);

        toy.putToStorage(storage);
        toy2.putToStorage(storage);
        car.putToStorage(storage);
        furniture.putToStorage(storage);

        List<Toy> toys = storage.getToys("Person", 2);
        List<Car> cars = storage.getCars("Person", 2);
    }
}
