package com.andrewchokh.pcbuilder.persistence.entity.enums;

public enum DriveFormFactor {
    M22280("M.2 2280"),
    I35("3.5″"),
    I25("2.5″");

    private final String formFactor;

    DriveFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return formFactor;
    }
}
