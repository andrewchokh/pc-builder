package com.andrewchokh.pcbuilder.persistence.entity.enums;

public enum Chipset {
    AMDB550("AMD B550"),
    AMDB650("AMD B650"),
    IntelB660("Intel B660");

    private final String chipset;

    Chipset(String chipset) {
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return chipset;
    }
}
