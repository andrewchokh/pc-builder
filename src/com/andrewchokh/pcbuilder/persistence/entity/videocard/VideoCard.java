package com.andrewchokh.pcbuilder.persistence.entity.videocard;

public class VideoCard {
    private final int id;
    private final String name;
    private final int memoryAmount;
    private final String brand;

    VideoCard(int id, String name, int memoryAmount, String brand) {
        this.id = id;
        this.name = name;
        this.memoryAmount = memoryAmount;
        this.brand = brand;
    }
}
