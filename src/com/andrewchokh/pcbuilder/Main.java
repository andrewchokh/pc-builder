package com.andrewchokh.pcbuilder;

import com.andrewchokh.pcbuilder.persistence.entity.enums.Chipset;
import com.andrewchokh.pcbuilder.persistence.entity.enums.FormFactor;
import com.andrewchokh.pcbuilder.persistence.entity.motherboard.MotherboardBuilder;

public class Main {
    public static void main(String[] args) {
        var mb = new MotherboardBuilder()
                .Id(12)
                .Name("Материнська плата Gigabyte B550M AORUS ELITE (sAM4, AMD B550)")
                .FormFactor(FormFactor.microATX)
                .RamSlotsAmount(4)
                .Chipset(Chipset.AMD_B550)
                .Manufacturer("Gigabyte")
                .build();

        System.out.println(mb.getChipset().toString());
    }
}