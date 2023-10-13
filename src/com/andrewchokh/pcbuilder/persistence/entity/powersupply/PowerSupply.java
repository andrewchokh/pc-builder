package com.andrewchokh.pcbuilder.persistence.entity.powersupply;

import com.andrewchokh.pcbuilder.persistence.entity.enums.MotherboardFormFactor;

public class PowerSupply {
    private final int id;
    private final String name;
    private final String brand;
    private final int price;
    private final MotherboardFormFactor formFactor;
    private final int power;

    PowerSupply(int id, String name, String brand, int price, MotherboardFormFactor formFactor, int power) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.formFactor = formFactor;
        this.power = power;
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

    public MotherboardFormFactor getFormFactor() {
        return this.formFactor;
    }

    public int getPower() {
        return this.power;
    }
}
