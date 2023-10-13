package com.andrewchokh.pcbuilder.persistence.entity.videocard;

import com.andrewchokh.pcbuilder.persistence.entity.enums.VideoCardMemoryType;

import java.util.Objects;
import java.util.stream.Stream;

public class VideoCardBuilder {
    private int id;
    private String name;
    private String brand; // In GB
    private int price;
    private int memoryAmount; // In GB
    private VideoCardMemoryType memoryType;

    public VideoCardBuilder Id(final int id) {
        this.id = id;
        return this;
    }

    public VideoCardBuilder Name(final String name) {
        this.name = name;
        return this;
    }

    public VideoCardBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }

    public VideoCardBuilder Price(final int price) {
        this.price = price;
        return this;
    }

    public VideoCardBuilder MemoryAmount(final int memoryAmount) {
        this.memoryAmount = memoryAmount;
        return this;
    }

    public VideoCardBuilder MemoryType(final VideoCardMemoryType memoryType) {
        this.memoryType = memoryType;
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

    public int getMemoryAmount() {
        return this.memoryAmount;
    }

    public VideoCardMemoryType getMemoryType() {
        return this.memoryType;
    }

    public boolean hasAllRequiredFieldsEntered() {
        return Stream.of(id, name, brand, price, memoryAmount, memoryType)
                .allMatch(Objects::nonNull);
    }

    public VideoCard build() {
        if (!hasAllRequiredFieldsEntered()) throw new RuntimeException("One or several required fields are null");
        return new VideoCard(id, name, brand, price, memoryAmount, memoryType);
    }
}
