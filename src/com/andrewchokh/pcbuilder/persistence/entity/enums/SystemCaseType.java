package com.andrewchokh.pcbuilder.persistence.entity.enums;

public enum SystemCaseType {
    MidiTower("Midi tower");

    private final String type;

    SystemCaseType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
