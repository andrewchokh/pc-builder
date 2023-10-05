package com.andrewchokh.pcbuilder.persistence.entity.enums;

public enum MotherboardFormFactor {
    microATX("microATX"),
    ATX("ATX");

    private final String formFactor;

    MotherboardFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return formFactor;
    }
}
