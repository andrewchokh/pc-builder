package com.andrewchokh.pcbuilder.persistence.entity.coolingdevice;

import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class WaterCoolingBuilder extends CoolingDeviceBuilder {
    @Override
    public WaterCoolingBuilder Id(final int id) {
        this.id = id;
        return this;
    }

    @Override
    public WaterCoolingBuilder Name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public WaterCoolingBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public WaterCoolingBuilder Price(final int price) {
        this.price = price;
        return this;
    }

    @Override
    public WaterCoolingBuilder Sockets(final List<Socket> sockets) {
        this.sockets = sockets;
        return this;
    }

    @Override
    public WaterCoolingBuilder FanAmount(final int fanAmount) {
        this.fanAmount = fanAmount;
        return this;
    }

    public boolean hasAllRequiredFieldsEntered() {
        return Stream.of(id, name, brand, price, sockets, fanAmount)
                .allMatch(Objects::nonNull);
    }

    @Override
    public WaterCooling build() {
        if (!hasAllRequiredFieldsEntered()) throw new RuntimeException("One or several required fields are null");
        return new WaterCooling(id, name, brand, price, sockets, fanAmount);
    }
}
