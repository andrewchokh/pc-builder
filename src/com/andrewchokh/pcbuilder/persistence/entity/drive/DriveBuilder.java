package com.andrewchokh.pcbuilder.persistence.entity.drive;

import com.andrewchokh.pcbuilder.persistence.entity.enums.DriveFormFactor;

public abstract class DriveBuilder {
    protected int id;
    protected String name;
    protected String brand;
    protected int price;
    protected DriveFormFactor formFactor;
    protected int memoryAmount; // In GB

    public DriveBuilder Id(final int id) {
        this.id = id;
        return this;
    }

    public DriveBuilder Name(final String name) {
        this.name = name;
        return this;
    }

    public DriveBuilder Brand(final String name) {
        this.name = name;
        return this;
    }

    public DriveBuilder Price(final int price) {
        this.price = price;
        return this;
    }

    public DriveBuilder FormFactor(final DriveFormFactor formFactor) {
        this.formFactor = formFactor;
        return this;
    }

    public DriveBuilder MemoryAmount(final int memoryAmount) {
        this.memoryAmount = memoryAmount;
        return this;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getPrice() {
        return this.price;
    }

    public DriveFormFactor getFormFactor() {
        return this.formFactor;
    }

    public int getMemoryAmount() {
        return this.memoryAmount;
    }

    public Drive build() {
        return null;
    }
}
