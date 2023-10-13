package com.andrewchokh.pcbuilder.persistence.entity.powersupply;

import com.andrewchokh.pcbuilder.persistence.entity.enums.MotherboardFormFactor;
import com.andrewchokh.pcbuilder.persistence.entity.ram.Ram;

import java.util.Objects;
import java.util.stream.Stream;

public class PowerSupplyBuilder {
    private int id;
    private String name;
    private String brand;
    private int price;
    private MotherboardFormFactor formFactor;
    private int power;

    public PowerSupplyBuilder Id(final int id) {
        this.id = id;
        return this;
    }

    public PowerSupplyBuilder Name(final String name) {
        this.name = name;
        return this;
    }

    public PowerSupplyBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }

    public PowerSupplyBuilder Price(final int price) {
        this.price = price;
        return this;
    }

    public PowerSupplyBuilder FormFactor(final MotherboardFormFactor formFactor) {
        this.formFactor = formFactor;
        return this;
    }

    public PowerSupplyBuilder Power(final int power) {
        this.power = power;
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

    public MotherboardFormFactor getFormFactor() {
        return this.formFactor;
    }

    public int getPower() {
        return this.power;
    }

    public boolean hasAllRequiredFieldsEntered() {
        return Stream.of(id, name, brand, price, formFactor, power)
                .allMatch(Objects::nonNull);
    }

    public PowerSupply build() {
        if (!hasAllRequiredFieldsEntered()) throw new RuntimeException("One or several required fields are null");
        return new PowerSupply(id, name, brand, price, formFactor, power);
    }
}
