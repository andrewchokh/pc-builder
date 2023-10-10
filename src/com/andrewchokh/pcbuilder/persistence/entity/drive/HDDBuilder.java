package com.andrewchokh.pcbuilder.persistence.entity.drive;

import com.andrewchokh.pcbuilder.persistence.entity.enums.DriveFormFactor;

public class HDDBuilder implements DriveBuildTemplate {
    private int id;
    private String name;
    private DriveFormFactor formFactor;
    private int memoryAmount; // In GB
    private int rotationSpeed;

    @Override
    public HDDBuilder Id(final int id) {
        this.id = id;
        return this;
    }

    @Override
    public HDDBuilder Name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public HDDBuilder FormFactor(final DriveFormFactor formFactor) {
        this.formFactor = formFactor;
        return this;
    }

    @Override
    public HDDBuilder MemoryAmount(final int memoryAmount) {
        this.memoryAmount = memoryAmount;
        return this;
    }

    public HDDBuilder RotationSpeed(final int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
        return this;
    }


    public HDD build() {
        return new HDD(id, name, formFactor, memoryAmount, rotationSpeed);
    }
}
