package com.andrewchokh.pcbuilder.persistence.entity.systemcase;

import com.andrewchokh.pcbuilder.persistence.entity.enums.MotherboardFormFactor;
import com.andrewchokh.pcbuilder.persistence.entity.enums.SystemCaseType;
import com.andrewchokh.pcbuilder.persistence.entity.powersupply.PowerSupply;

import java.util.List;

public class SystemCase {
    private final int id;
    private final String name;
    private final String brand;
    private final int price;
    private final SystemCaseType type;
    private final List<MotherboardFormFactor> formFactors;

    // Secondary components
    private final PowerSupply powerSupply;

    SystemCase(int id, String name, String brand, int price, SystemCaseType type, List<MotherboardFormFactor> formFactors,
               PowerSupply powerSupply) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.formFactors = formFactors;
        this.powerSupply = powerSupply;
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

    public List<MotherboardFormFactor> getFormFactors() {
        return this.formFactors;
    }

    public PowerSupply getPowerSupply() {
        return this.powerSupply;
    }
}
