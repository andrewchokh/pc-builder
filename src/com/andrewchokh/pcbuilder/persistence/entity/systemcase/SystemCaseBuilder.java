package com.andrewchokh.pcbuilder.persistence.entity.systemcase;

import com.andrewchokh.pcbuilder.persistence.entity.enums.MotherboardFormFactor;
import com.andrewchokh.pcbuilder.persistence.entity.enums.SystemCaseType;
import com.andrewchokh.pcbuilder.persistence.entity.powersupply.PowerSupply;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class SystemCaseBuilder {
    private int id;
    private String name;
    private String brand;
    private int price;
    private SystemCaseType type;
    private List<MotherboardFormFactor> formFactors;

    //Secondary components
    private PowerSupply powerSupply;

    public SystemCaseBuilder Id(final int id) {
        this.id = id;
        return this;
    }

    public SystemCaseBuilder Name(final String name) {
        this.name = name;
        return this;
    }

    public SystemCaseBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }

    public SystemCaseBuilder Price(final int price) {
        this.price = price;
        return this;
    }

    public SystemCaseBuilder Type(final SystemCaseType type) {
        this.type = type;
        return this;
    }

    public SystemCaseBuilder FormFactors(final List<MotherboardFormFactor> formFactors) {
        this.formFactors = formFactors;
        return this;
    }

    public SystemCaseBuilder PowerSupply(final PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
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

    public SystemCaseType getType() {
        return this.type;
    }

    public List<MotherboardFormFactor> getFormFactor() {
        return this.formFactors;
    }

    public PowerSupply getPowerSupply() {
        return this.powerSupply;
    }

    public boolean hasAllRequiredFieldsEntered() {
        return Stream.of(id, name, brand, price, type, formFactors)
                .allMatch(Objects::nonNull);
    }

    public SystemCase build() {
        if (!hasAllRequiredFieldsEntered()) throw new RuntimeException("One or several required fields are null");
        return new SystemCase(id, name, brand, price, type, formFactors, powerSupply);
    }
}
