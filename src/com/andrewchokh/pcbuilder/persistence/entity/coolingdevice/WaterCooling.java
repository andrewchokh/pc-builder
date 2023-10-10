package com.andrewchokh.pcbuilder.persistence.entity.coolingdevice;

import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

import java.util.List;

public class WaterCooling extends CoolingDevice {
    WaterCooling(int id, String name, List<Socket> sockets, int fanAmount, String brand) {
        this.id = id;
        this.name = name;
        this.sockets = sockets;
        this.fanAmount = fanAmount;
        this.brand = brand;
    }
}
