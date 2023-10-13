package com.andrewchokh.pcbuilder.persistence.entity.audiocard;

import java.util.Objects;
import java.util.stream.Stream;

public class AudioCardBuilder {
    private int id;
    private String name;
    private String brand;
    private int price;
    private float signalToNoiseRatio;
    private int bitDepth;

    public AudioCardBuilder Id(final int id) {
        this.id = id;
        return this;
    }

    public AudioCardBuilder Name(final String name) {
        this.name = name;
        return this;
    }

    public AudioCardBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }

    public AudioCardBuilder Price(final int price) {
        this.price = price;
        return this;
    }

    public AudioCardBuilder SignalToNoiseRatio(final float signalToNoiseRatio) {
        this.signalToNoiseRatio = signalToNoiseRatio;
        return this;
    }

    public AudioCardBuilder BitDepth(final int bitDepth) {
        this.bitDepth = bitDepth;
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

    public float getSignalToNoiseRatio() {
        return this.signalToNoiseRatio;
    }

    public int getBitDepth() {
        return this.bitDepth;
    }

    public boolean hasAllRequiredFieldsEntered() {
        return Stream.of(id, name, brand, price, signalToNoiseRatio, bitDepth)
                .allMatch(Objects::nonNull);
    }

    public AudioCard build() {
        if (!hasAllRequiredFieldsEntered()) throw new RuntimeException("One or several required fields are null");
        return new AudioCard(id, name, brand, price, signalToNoiseRatio, bitDepth);
    }
}
