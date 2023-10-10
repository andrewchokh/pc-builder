package com.andrewchokh.pcbuilder.persistence.entity.enums;

public enum VideoCardMemoryType {
    GDDR6("GDDR6"),
    GDDR5("GDDR5"),
    GDDR6X("GDDR6X");

    private final String type;

    VideoCardMemoryType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
