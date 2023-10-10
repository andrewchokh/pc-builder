package com.andrewchokh.pcbuilder.persistence.entity.drive;

import com.andrewchokh.pcbuilder.persistence.entity.enums.DriveFormFactor;

public interface DriveBuildTemplate {
    default DriveBuildTemplate Id(final int id) {
        return this;
    }

    default DriveBuildTemplate Name(final String name) {
        return this;
    }

    default DriveBuildTemplate FormFactor(final DriveFormFactor formFactor) {
        return this;
    }

    default DriveBuildTemplate MemoryAmount(final int memoryAmount) {
        return this;
    }

    default DriveBuildTemplate Brand(final String brand) {
        return this;
    }
}
