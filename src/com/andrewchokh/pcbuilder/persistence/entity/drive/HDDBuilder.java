package com.andrewchokh.pcbuilder.persistence.entity.drive;

import com.andrewchokh.pcbuilder.persistence.entity.enums.DriveFormFactor;

public class HDDBuilder implements DriveBuildMethods {
    private int id;
    private String name;
    private DriveFormFactor formFactor;
    private int memoryAmount; // In GB
    private int readingSpeed;
    private int writingSpeed;

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

    @Override
    public HDDBuilder ReadingSpeed(final int readingSpeed) {
        this.readingSpeed = readingSpeed;
        return this;
    }

    @Override
    public HDDBuilder WritingSpeed(final int writingSpeed) {
        this.writingSpeed = writingSpeed;
        return this;
    }

    public HDD build() {
        return new HDD(id, name, formFactor, memoryAmount, readingSpeed, writingSpeed);
    }
}
