package com.andrewchokh.pcbuilder.persistence.entity.coolingdevice;

import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

import java.util.List;

public abstract class CoolingDevice {
    int id;
    String name;
    List<Socket> sockets;
    int fanAmount;
    String brand;

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public List<Socket> getSockets() {
        return this.sockets;
    }
    public int getFanAmount() {
        return this.fanAmount;
    }
    public String getBrand() {
        return this.brand;
    }
}
