package com.andrewchokh.pcbuilder.persistence.entity.drive;

import com.andrewchokh.pcbuilder.persistence.entity.enums.DriveFormFactor;

public interface DriveBuildMethods {
    public default DriveBuildMethods Id(final int id) {
        return this;
    }

    public default DriveBuildMethods Name(final String name) {
        return this;
    }

    public default DriveBuildMethods FormFactor(final DriveFormFactor formFactor) {
        return this;
    }

    public default DriveBuildMethods MemoryAmount(final int memoryAmount) {
        return this;
    }

    public default DriveBuildMethods ReadingSpeed(final int readingSpeed) {
        return this;
    }

    public default DriveBuildMethods WritingSpeed(final int writingSpeed) {
        return this;
    }
}
