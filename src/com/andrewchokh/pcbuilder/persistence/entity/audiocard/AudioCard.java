package com.andrewchokh.pcbuilder.persistence.entity.audiocard;

public class AudioCard {
    private final int id;
    private final String name;
    private final String brand;
    private final int price;
    private final float signalToNoiseRatio;
    private final int bitDepth;

    AudioCard(int id, String name, String brand, int price, float signalToNoiseRatio, int bitDepth) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.signalToNoiseRatio = signalToNoiseRatio;
        this.bitDepth = bitDepth;
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

    public float getSignalToNoiseRatio() {
        return this.signalToNoiseRatio;
    }

    public int getBitDepth() {
        return this.bitDepth;
    }
}
