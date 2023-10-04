package com.andrewchokh.pcbuilder.persistence.entity.enums;

public enum Chipset {
    AMD_B550("AMD B550"),
    LGA1700("LGA1700");

    private final String chipset;

    Chipset(String chipset) {
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return chipset;
    }
}
