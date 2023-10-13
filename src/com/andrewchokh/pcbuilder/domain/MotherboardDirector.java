package com.andrewchokh.pcbuilder.domain;

import com.andrewchokh.pcbuilder.persistence.entity.enums.Chipset;
import com.andrewchokh.pcbuilder.persistence.entity.enums.MotherboardFormFactor;
import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;
import com.andrewchokh.pcbuilder.persistence.entity.motherboard.MotherboardBuilder;

public class MotherboardDirector {
    public void buildGigabyteB550MAORUSELITE(MotherboardBuilder builder) {
        builder
                .Id(10)
                .Name("Gigabyte B550M AORUS ELITE")
                .Brand("Gigabyte")
                .Price(3999)
                .FormFactor(MotherboardFormFactor.microATX)
                .RamSlotsAmount(4)
                .M2ConnectorAmount(2)
                .Chipset(Chipset.AMDB550)
                .Socket(Socket.AM4);
    }

    public void buildAsusROGSTRIXB650EFGAMING(MotherboardBuilder builder) {
        builder
                .Id(11)
                .Name("Asus ROG STRIX B650E-F GAMING")
                .Brand("Asus")
                .Price(12599)
                .FormFactor(MotherboardFormFactor.ATX)
                .RamSlotsAmount(4)
                .M2ConnectorAmount(3)
                .Chipset(Chipset.AMDB650)
                .Socket(Socket.AM5);
    }

    public void buildAsusPRIMEB660MKD4(MotherboardBuilder builder) {
        builder
                .Id(12)
                .Name("Asus PRIME B660M-K D4")
                .Brand("Asus")
                .Price(3899)
                .FormFactor(MotherboardFormFactor.microATX)
                .RamSlotsAmount(2)
                .M2ConnectorAmount(2)
                .Chipset(Chipset.IntelB660)
                .Socket(Socket.LGA1700);
    }
}
