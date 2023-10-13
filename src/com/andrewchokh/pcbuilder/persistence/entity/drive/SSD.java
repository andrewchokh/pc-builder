package com.andrewchokh.pcbuilder.persistence.entity.drive;

import com.andrewchokh.pcbuilder.persistence.entity.enums.DriveFormFactor;

public class SSD extends Drive {
    private final int readingSpeed;
    private final int writingSpeed;
    private final boolean NVMeSupport;

    SSD(int id, String name, String brand, int price, DriveFormFactor formFactor, int memoryAmount, int readingSpeed,
        int writingSpeed, boolean NVMeSupport) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.formFactor = formFactor;
        this.memoryAmount = memoryAmount;
        this.readingSpeed = readingSpeed;
        this.writingSpeed = writingSpeed;
        this.NVMeSupport = NVMeSupport;
    }

    public int getReadingSpeed() {
        return this.readingSpeed;
    }
    public int getWritingSpeed() {
        return this.writingSpeed;
    }
    public boolean getNVMeSupport() {
        return this.NVMeSupport;
    }
}
