package com.andrewchokh.pcbuilder.domain;

import com.andrewchokh.pcbuilder.persistence.entity.enums.MotherboardFormFactor;
import com.andrewchokh.pcbuilder.persistence.entity.powersupply.PowerSupplyBuilder;

public class PowerSupplyDirector {
    public void buildMSIMAG650W(PowerSupplyBuilder builder) {
        builder
                .Id(80)
                .Name("MSI MAG 650W")
                .Brand("MSI")
                .Price(2299)
                .FormFactor(MotherboardFormFactor.ATX)
                .Power(650);
    }

    public void buildGigabyteP750GM(PowerSupplyBuilder builder) {
        builder
                .Id(81)
                .Name("Gigabyte P750GM")
                .Brand("Gigabyte")
                .Price(3599)
                .FormFactor(MotherboardFormFactor.ATX)
                .Power(750);
    }

    public void buildCHIEFTECProton600W(PowerSupplyBuilder builder) {
        builder
                .Id(82)
                .Name("CHIEFTEC Proton 600W")
                .Brand("CHIEFTEC")
                .Price(2759)
                .FormFactor(MotherboardFormFactor.ATX)
                .Power(600);
    }
}
