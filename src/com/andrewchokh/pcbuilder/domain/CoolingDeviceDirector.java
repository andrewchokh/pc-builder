package com.andrewchokh.pcbuilder.domain;

import com.andrewchokh.pcbuilder.persistence.entity.coolingdevice.CoolerBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.coolingdevice.WaterCoolingBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

import java.util.Arrays;

public class CoolingDeviceDirector {
    public void buildAerocoolCylon4ARGB(CoolerBuilder builder) {
        builder
                .Id(30)
                .Name("Aerocool Cylon 4 ARGB")
                .Brand("Aerocool")
                .Price(1499)
                .Sockets(Arrays.asList(Socket.LGA1200, Socket.LGA1700, Socket.AM4, Socket.AM5))
                .FanAmount(1);
    }

    public void buildArcticFreezer34eSportsDUO(CoolerBuilder builder) {
        builder
                .Id(31)
                .Name("Arctic Freezer 34 eSports DUO")
                .Brand("Arctic")
                .Price(1499)
                .Sockets(Arrays.asList(Socket.LGA1200, Socket.LGA1700, Socket.AM4, Socket.AM5))
                .FanAmount(2);
    }

    public void buildArcticFreezer34eSportsDUO(WaterCoolingBuilder builder) {
        builder
                .Id(32)
                .Name("СВО Asus TUF Gaming LC 240 ARGB")
                .Brand("СВО")
                .Price(5119)
                .Sockets(Arrays.asList(Socket.LGA1200, Socket.LGA1700, Socket.AM4))
                .FanAmount(2);
    }
}
