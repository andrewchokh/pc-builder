package com.andrewchokh.pcbuilder.persistence.entity.ram;

import com.andrewchokh.pcbuilder.persistence.entity.enums.RamMemoryType;

import java.util.Objects;
import java.util.stream.Stream;

public class RamBuilder {
    private int id;
    private String name;
    private String brand;
    private int price;
    private RamMemoryType type;
    private int memoryAmount;
    private int frequency;


    public RamBuilder Id(final int id) {
        this.id = id;
        return this;
    }

    public RamBuilder Name(final String name) {
        this.name = name;
        return this;
    }

    public RamBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }

    public RamBuilder Price(final int price) {
        this.price = price;
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

    public boolean hasAllRequiredFieldsEntered() {
        return Stream.of(id, name, brand, price, type, memoryAmount, frequency)
                .allMatch(Objects::nonNull);
    }

    public Ram build() {
        if (!hasAllRequiredFieldsEntered()) throw new RuntimeException("One or several required fields are null");
        return new Ram(id, name, brand, price, type, memoryAmount, frequency);
    }
}
