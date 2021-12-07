package com.donnu.demo.aop;

import org.springframework.context.annotation.Scope;

public abstract class AbstractItem implements InterfaceItem {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void putToStorage(Storage storage) {
        storage.addItem(this);
    }
}
