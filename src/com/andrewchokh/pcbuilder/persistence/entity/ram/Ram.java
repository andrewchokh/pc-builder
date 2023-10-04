package com.andrewchokh.pcbuilder.persistence.entity.ram;

import com.andrewchokh.pcbuilder.persistence.entity.enums.RamType;

public class Ram {
    private final int id;
    private final String name;
    private final RamType type;
    private final int memoryAmount;
    private final int frequency;

    Ram(int id, String name, RamType type, int memoryAmount, int frequency) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.memoryAmount = memoryAmount;
        this.frequency = frequency;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public RamType getType() {
        return this.type;
    }

    public int getMemoryAmount() {
        return this.memoryAmount;
    }

    public int getFrequency() {
        return this.frequency;
    }
}
