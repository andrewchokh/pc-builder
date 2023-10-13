package com.andrewchokh.pcbuilder.persistence.entity.coolingdevice;

import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

import java.util.List;

public abstract class CoolingDeviceBuilder {
    protected int id;
    protected String name;
    protected String brand;
    protected int price;
    protected List<Socket> sockets;
    protected int fanAmount;


    public CoolingDeviceBuilder Id(final int id) {
        this.id = id;
        return this;
    }

    public CoolingDeviceBuilder Name(final String name) {
        this.name = name;
        return this;
    }

    public CoolingDeviceBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }

    public CoolingDeviceBuilder Price(final int price) {
        this.price = price;
        return this;
    }

    public CoolingDeviceBuilder Sockets(final List<Socket> sockets) {
        this.sockets = sockets;
        return this;
    }

    public CoolingDeviceBuilder FanAmount(final int fanAmount) {
        this.fanAmount = fanAmount;
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

    public List<Socket> getSockets() {
        return this.sockets;
    }

    public int getFanAmount() {
        return this.fanAmount;
    }

    public CoolingDevice build() {
        return null;
    }
}
