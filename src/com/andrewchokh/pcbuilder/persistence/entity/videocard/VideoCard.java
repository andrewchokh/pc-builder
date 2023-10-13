package com.andrewchokh.pcbuilder.persistence.entity.videocard;

import com.andrewchokh.pcbuilder.persistence.entity.enums.VideoCardMemoryType;

public class VideoCard {
    private final int id; // In GB
    private final String name; // In GB
    private final String brand; // In GB
    private final int price;
    private final int memoryAmount; // In GB
    private final VideoCardMemoryType memoryType;

    VideoCard(int id, String name, String brand, int price, int memoryAmount, VideoCardMemoryType memoryType) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.memoryAmount = memoryAmount;
        this.memoryType = memoryType;
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
}
