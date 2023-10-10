package com.andrewchokh.pcbuilder.persistence.entity.videocard;

import com.andrewchokh.pcbuilder.persistence.entity.enums.VideoCardMemoryType;

public class VideoCard {
    private final int id;
    private final String name;
    private final int memoryAmount; // In GB
    private final VideoCardMemoryType memoryType;
    private final String brand;

    VideoCard(int id, String name, int memoryAmount, VideoCardMemoryType memoryType, String brand) {
        this.id = id;
        this.name = name;
        this.memoryAmount = memoryAmount;
        this.memoryType = memoryType;
        this.brand = brand;
    }
}
