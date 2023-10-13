package com.andrewchokh.pcbuilder.persistence.entity.coolingdevice;

import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

import java.util.List;

public class Cooler extends CoolingDevice {
    Cooler(int id, String name, String brand, int price, List<Socket> sockets, int fanAmount) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.sockets = sockets;
        this.fanAmount = fanAmount;
    }
}
