package com.andrewchokh.pcbuilder.persistence.entity.ram;

import com.andrewchokh.pcbuilder.persistence.entity.enums.RamMemoryType;

public class RamBuilder {
    private int id;
    private String name;
    private RamMemoryType type;
    private int memoryAmount;
    private int frequency;
    private String brand;

    public RamBuilder Id(final int id) {
        this.id = id;
        return this;
    }

    public RamBuilder Name(final String name) {
        this.name = name;
        return this;
    }

    public RamBuilder Type(final RamMemoryType type) {
        this.type = type;
        return this;
    }

    public RamBuilder MemoryAmount(final int memoryAmount) {
        this.memoryAmount = memoryAmount;
        return this;
    }

    public RamBuilder Frequency(final int frequency) {
        this.frequency = frequency;
        return this;
    }

    public RamBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }

    public Ram build() {
        return new Ram(id, name, type, memoryAmount, frequency, brand);
    }
}
