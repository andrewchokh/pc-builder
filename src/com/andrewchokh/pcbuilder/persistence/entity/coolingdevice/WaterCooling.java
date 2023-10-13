package com.andrewchokh.pcbuilder.persistence.entity.coolingdevice;

import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

import java.util.List;

public class WaterCooling extends CoolingDevice {
    WaterCooling(int id, String name, String brand, int price, List<Socket> sockets, int fanAmount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.sockets = sockets;
        this.fanAmount = fanAmount;
    }
}
