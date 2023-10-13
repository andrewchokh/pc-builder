package com.andrewchokh.pcbuilder.persistence.entity.drive;

import com.andrewchokh.pcbuilder.persistence.entity.enums.DriveFormFactor;

import java.util.Objects;
import java.util.stream.Stream;

public class HDDBuilder extends DriveBuilder {
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
    public HDDBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public HDDBuilder Price(final int price) {
        this.price = price;
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

    public int getRotationSpeed() {
        return this.rotationSpeed;
    }

    public boolean hasAllRequiredFieldsEntered() {
        return Stream.of(id, name, brand, price, formFactor, memoryAmount, rotationSpeed)
                .allMatch(Objects::nonNull);

    }

    @Override
    public HDD build() {
        if (!hasAllRequiredFieldsEntered()) throw new RuntimeException("One or several required fields are null");
        return new HDD(id, name, brand, price, formFactor, memoryAmount, rotationSpeed);
    }
}
