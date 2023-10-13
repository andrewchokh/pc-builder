package com.andrewchokh.pcbuilder.persistence.entity.computersystemunit;

import com.andrewchokh.pcbuilder.persistence.entity.motherboard.Motherboard;
import com.andrewchokh.pcbuilder.persistence.entity.powersupply.PowerSupply;
import com.andrewchokh.pcbuilder.persistence.entity.systemcase.SystemCase;

public class ComputerSystemUnit {
    private final Motherboard motherboard;
    private final SystemCase systemCase;
    private final int price;

    ComputerSystemUnit(Motherboard motherboard, SystemCase systemCase, int price) {
        this.motherboard = motherboard;
        this.systemCase = systemCase;
        this.price = price;
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
}
