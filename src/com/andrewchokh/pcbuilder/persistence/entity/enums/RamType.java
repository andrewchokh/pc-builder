package com.andrewchokh.pcbuilder.persistence.entity.enums;

public enum RamType {
    DDR4("DDR4"),
    DDR5("DDR5"),
    DDR3("DDR3");

    private final String type;

    RamType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
