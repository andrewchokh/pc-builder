package com.andrewchokh.pcbuilder.persistence.entity.ram;

import com.andrewchokh.pcbuilder.persistence.entity.enums.RamMemoryType;

public class Ram {
    private final int id;
    private final String name;
    private final String brand;
    private final int price;
    private final RamMemoryType type;
    private final int memoryAmount;
    private final int frequency;

    Ram(int id, String name, String brand, int price, RamMemoryType type, int memoryAmount, int frequency) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
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

    public String getBrand() {
        return this.brand;
    }

    public int getPrice() {
        return this.price;
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
}
