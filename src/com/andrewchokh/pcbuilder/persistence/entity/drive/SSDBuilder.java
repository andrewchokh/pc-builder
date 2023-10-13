package com.andrewchokh.pcbuilder.persistence.entity.drive;

import com.andrewchokh.pcbuilder.persistence.entity.enums.DriveFormFactor;

import java.util.Objects;
import java.util.stream.Stream;

public class SSDBuilder extends DriveBuilder {
    private int readingSpeed;
    private int writingSpeed;
    private boolean NVMeSupport;

    @Override
    public SSDBuilder Id(final int id) {
        this.id = id;
        return this;
    }

    @Override
    public SSDBuilder Name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public SSDBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public SSDBuilder Price(final int price) {
        this.price = price;
        return this;
    }

    @Override
    public SSDBuilder FormFactor(final DriveFormFactor formFactor) {
        this.formFactor = formFactor;
        return this;
    }

    @Override
    public SSDBuilder MemoryAmount(final int memoryAmount) {
        this.memoryAmount = memoryAmount;
        return this;
    }

    public SSDBuilder ReadingSpeed(final int readingSpeed) {
        this.readingSpeed = readingSpeed;
        return this;
    }

    public SSDBuilder WritingSpeed(final int writingSpeed) {
        this.writingSpeed = writingSpeed;
        return this;
    }

    public SSDBuilder NVMeSupport(final boolean NVMeSupport) {
        this.NVMeSupport = NVMeSupport;
        return this;
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

    public boolean hasAllRequiredFieldsEntered() {
        return Stream.of(id, name, brand, price, formFactor, memoryAmount, readingSpeed, writingSpeed, NVMeSupport)
                .allMatch(Objects::nonNull);
    }

    @Override
    public SSD build() {
        if (!hasAllRequiredFieldsEntered()) throw new RuntimeException("One or several required fields are null");
        return new SSD(id, name, brand, price, formFactor, memoryAmount, readingSpeed, writingSpeed, NVMeSupport);
    }
}
