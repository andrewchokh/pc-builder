package com.andrewchokh.pcbuilder.persistence.entity.ram;

import com.andrewchokh.pcbuilder.persistence.entity.enums.RamMemoryType;

public class Ram {
    private final int id;
    private final String name;
    private final RamMemoryType type;
    private final int memoryAmount;
    private final int frequency;
    private final String brand;

    Ram(int id, String name, RamMemoryType type, int memoryAmount, int frequency, String brand) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.memoryAmount = memoryAmount;
        this.frequency = frequency;
        this.brand = brand;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public RamMemoryType getType() {
        return this.type;
    }

    public int getMemoryAmount() {
        return this.memoryAmount;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public String getBrand() {
        return this.brand;
    }
}
