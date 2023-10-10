package com.andrewchokh.pcbuilder.persistence.entity.coolingdevice;

import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

import java.util.List;

public class CoolerBuilder implements CoolingDeviceBuilderTemplate {
    private int id;
    private String name;
    private List<Socket> sockets;
    private int fanAmount;
    private String brand;

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
    public CoolerBuilder Sockets(final List<Socket> sockets) {
        this.sockets = sockets;
        return this;
    }

    @Override
    public CoolerBuilder FanAmount(final int fanAmount) {
        this.fanAmount = fanAmount;
        return this;
    }

    @Override
    public CoolerBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }

    public Cooler build() {
        return new Cooler(id, name, sockets, fanAmount, brand);
    }
}
