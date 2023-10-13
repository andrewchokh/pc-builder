package com.andrewchokh.pcbuilder.persistence.entity.computersystemunit;

import com.andrewchokh.pcbuilder.persistence.entity.motherboard.Motherboard;
import com.andrewchokh.pcbuilder.persistence.entity.systemcase.SystemCase;

public class ComputerSystemUnitBuilder {
    private Motherboard motherboard;
    private SystemCase systemCase;
    private int price;

    public ComputerSystemUnitBuilder Motherboard(final Motherboard motherboard){
        this.motherboard = motherboard;
        return this;
    }

    public ComputerSystemUnitBuilder SystemCase(final SystemCase systemCase){
        this.systemCase = systemCase;
        return this;
    }

    public ComputerSystemUnitBuilder Price(final int price){
        this.price = price;
        return this;
    }

    public Motherboard getMotherboard() {
        return this.motherboard;
    }

    public SystemCase getSystemCase() {
        return this.systemCase;
    }

    public int getPrice() {
        return this.price;
    }

    public ComputerSystemUnit build() {
        return new ComputerSystemUnit(motherboard, systemCase, price);
    }
}
