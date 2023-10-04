package com.andrewchokh.pcbuilder.persistence.entity.enums;

public enum Line {
    AMDRyzen5("AMD Ryzen 5"),
    AMDRyzen9("AMD Ryzen 9"),
    IntelCorei5("Intel Core i5"),
    IntelCorei7("Intel Core i7");

    private final String line;

    Line(String line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return line;
    }
}
