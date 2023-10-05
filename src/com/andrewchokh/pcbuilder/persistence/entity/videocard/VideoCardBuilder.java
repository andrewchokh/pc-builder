package com.andrewchokh.pcbuilder.persistence.entity.videocard;

public class VideoCardBuilder {
    private int id;
    private String name;
    private int memoryAmount;
    private String brand;

    public VideoCardBuilder Id(final int id) {
        this.id = id;
        return this;
    }

    public VideoCardBuilder Name(final String name) {
        this.name = name;
        return this;
    }
    public VideoCardBuilder MemoryAmount(final int memoryAmount) {
        this.memoryAmount = memoryAmount;
        return this;
    }

    public VideoCardBuilder Brand(final String processorFamily) {
        this.brand = brand;
        return this;
    }

    public VideoCard build() {
        return new VideoCard(id, name, memoryAmount, brand);
    }
}
