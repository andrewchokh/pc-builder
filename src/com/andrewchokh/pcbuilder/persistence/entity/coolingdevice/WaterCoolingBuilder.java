package com.andrewchokh.pcbuilder.persistence.entity.coolingdevice;

import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

import java.util.List;

public class WaterCoolingBuilder implements CoolingDeviceBuilderTemplate {
    private int id;
    private String name;
    private List<Socket> sockets;
    private int fanAmount;
    private String brand;

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
    public WaterCoolingBuilder Sockets(final List<Socket> sockets) {
        this.sockets = sockets;
        return this;
    }

    @Override
    public WaterCoolingBuilder FanAmount(final int fanAmount) {
        this.fanAmount = fanAmount;
        return this;
    }

    @Override
    public WaterCoolingBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }

    public WaterCooling build() {
        return new WaterCooling(id, name, sockets, fanAmount, brand);
    }
}
