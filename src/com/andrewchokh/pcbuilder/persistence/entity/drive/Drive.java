package com.andrewchokh.pcbuilder.persistence.entity.drive;

import com.andrewchokh.pcbuilder.persistence.entity.enums.DriveFormFactor;

public abstract class Drive {
    protected int id;
    protected String name;
    protected String brand;
    protected int price;
    protected DriveFormFactor formFactor;
    protected int memoryAmount; // In GB

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
}
