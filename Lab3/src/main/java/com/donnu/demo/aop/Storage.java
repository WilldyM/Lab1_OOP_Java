package com.donnu.demo.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class Storage {
    private List<InterfaceItem> items = new ArrayList<>();
    @Value("3")
    private int capacity;
    @Value("0")
    private int count;

    public List<Toy> getToys(String name, int quantity) {
        List<Toy> toys = new ArrayList<>();
        for (InterfaceItem item: this.items) {
            if (quantity == 0 || quantity < 0) {
                break;
            }
            if (item instanceof Toy) {
                toys.add((Toy) item);
                quantity--;
            }
        }
        for (Toy item: toys) {
            this.items.remove(item);
        }

        return toys;
    }

    public List<Car> getCars(String name, int quantity) {
        List<Car> cars = new ArrayList<>();
        for (InterfaceItem item: this.items) {
            if (quantity == 0 || quantity < 0) {
                break;
            }
            if (item instanceof Car) {
                cars.add((Car) item);
                quantity--;
            }
        }
        for (Car item: cars) {
            this.items.remove(item);
        }

        return cars;
    }

    public List<Furniture> getFurnitures(String name, int quantity) {
        List<Furniture> furnitures = new ArrayList<>();
        for (InterfaceItem item: this.items) {
            if (quantity == 0 || quantity < 0) {
                break;
            }
            if (item instanceof Furniture) {
                furnitures.add((Furniture) item);
                quantity--;
            }
        }
        for (Furniture item: furnitures) {
            this.items.remove(item);
        }

        return furnitures;
    }

    public void addItem(InterfaceItem item) {
        if (this.count < this.capacity) {
            this.items.add(item);
            this.count++;
        }
        else {
            System.out.println("Склад заполнен, предмет не добавлен");
        }
    }

    public List<InterfaceItem> showItems() {
        return items;
    }
}
