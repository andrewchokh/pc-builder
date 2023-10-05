package com.andrewchokh.pcbuilder.persistence.entity.drive;

import com.andrewchokh.pcbuilder.persistence.entity.enums.DriveFormFactor;

public abstract class Drive {
    int id;
    String name;
    DriveFormFactor formFactor;
    int memoryAmount; // In GB
    int readingSpeed;
    int writingSpeed;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public DriveFormFactor getFormFactor() {
        return this.formFactor;
    }

    public int getMemoryAmount() {
        return this.memoryAmount;
    }

    public int getReadingSpeed() {
        return this.readingSpeed;
    }

    public int getWritingSpeed() {
        return this.writingSpeed;
    }
}
