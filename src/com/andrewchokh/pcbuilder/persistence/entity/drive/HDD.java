package com.andrewchokh.pcbuilder.persistence.entity.drive;

import com.andrewchokh.pcbuilder.persistence.entity.enums.DriveFormFactor;

public class HDD extends Drive {
    HDD(int id, String name, DriveFormFactor formFactor, int memoryAmount, int readingSpeed, int writingSpeed) {
        this.id = id;
        this.name = name;
        this.formFactor = formFactor;
        this.memoryAmount = memoryAmount;
        this.readingSpeed = readingSpeed;
        this.writingSpeed = writingSpeed;
    }
}
