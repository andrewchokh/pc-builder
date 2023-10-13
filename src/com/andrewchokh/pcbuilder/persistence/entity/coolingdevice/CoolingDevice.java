package com.andrewchokh.pcbuilder.persistence.entity.coolingdevice;

import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

import java.util.List;

public abstract class CoolingDevice {
    protected int id;
    protected String name;
    protected String brand;
    protected int price;
    protected List<Socket> sockets;
    protected int fanAmount;


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



}
