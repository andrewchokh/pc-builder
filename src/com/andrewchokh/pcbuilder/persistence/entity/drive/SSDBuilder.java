package com.andrewchokh.pcbuilder.persistence.entity.drive;

import com.andrewchokh.pcbuilder.persistence.entity.enums.DriveFormFactor;

public class SSDBuilder implements DriveBuildMethods {
    private int id;
    private String name;
    private DriveFormFactor formFactor;
    private int memoryAmount; // In GB
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
    public SSDBuilder FormFactor(final DriveFormFactor formFactor) {
        this.formFactor = formFactor;
        return this;
    }

    @Override
    public SSDBuilder MemoryAmount(final int memoryAmount) {
        this.memoryAmount = memoryAmount;
        return this;
    }

    @Override
    public SSDBuilder ReadingSpeed(final int readingSpeed) {
        this.readingSpeed = readingSpeed;
        return this;
    }

    @Override
    public SSDBuilder WritingSpeed(final int writingSpeed) {
        this.writingSpeed = writingSpeed;
        return this;
    }

    public SSDBuilder NVMeSupport(final boolean NVMeSupport) {
        this.NVMeSupport = NVMeSupport;
        return this;
    }

    public SSD build() {
        return new SSD(id, name, formFactor, memoryAmount, readingSpeed, writingSpeed, NVMeSupport);
    }
}
