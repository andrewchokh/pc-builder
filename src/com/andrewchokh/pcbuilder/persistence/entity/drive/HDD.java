package com.andrewchokh.pcbuilder.persistence.entity.drive;

import com.andrewchokh.pcbuilder.persistence.entity.enums.DriveFormFactor;

public class HDD extends Drive {
    private final int rotationSpeed;

    HDD(int id, String name, String brand, int price, DriveFormFactor formFactor, int memoryAmount, int rotationSpeed) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.formFactor = formFactor;
        this.memoryAmount = memoryAmount;
        this.rotationSpeed = rotationSpeed;
    }

    public int getRotationSpeed() {
        return this.rotationSpeed;
    }
}
