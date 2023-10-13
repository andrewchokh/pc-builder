package com.andrewchokh.pcbuilder.persistence.entity.coolingdevice;

import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class CoolerBuilder extends CoolingDeviceBuilder {
    @Override
    public CoolerBuilder Id(final int id) {
        this.id = id;
        return this;
    }

    @Override
    public CoolerBuilder Name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public CoolerBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }
    @Override
    public CoolerBuilder Price(final int price) {
        this.price = price;
        return this;
    }

    @Override
    public CoolerBuilder Sockets(final List<Socket> sockets) {
        this.sockets = sockets;
        return this;
    }

    @Override
    public CoolerBuilder FanAmount(final int fanAmount) {
        this.fanAmount = fanAmount;
        return this;
    }

    public boolean hasAllRequiredFieldsEntered() {
        return Stream.of(id, name, brand, price, sockets, fanAmount)
                .allMatch(Objects::nonNull);
    }

    @Override
    public Cooler build() {
        if (!hasAllRequiredFieldsEntered()) throw new RuntimeException("One or several required fields are null");
        return new Cooler(id, name, brand, price, sockets, fanAmount);
    }
}
