package com.andrewchokh.pcbuilder.domain;

import com.andrewchokh.pcbuilder.persistence.entity.enums.MotherboardFormFactor;
import com.andrewchokh.pcbuilder.persistence.entity.enums.SystemCaseType;
import com.andrewchokh.pcbuilder.persistence.entity.systemcase.SystemCaseBuilder;

import java.util.Arrays;

public class SystemCaseDirector {
    public void buildMSIMAGForge100M(SystemCaseBuilder builder) {
        builder
                .Id(90)
                .Name("MSI MAG Forge 100M")
                .Brand("MSI")
                .Price(2499)
                .Type(SystemCaseType.MidiTower)
                .FormFactors(Arrays.asList(MotherboardFormFactor.microATX, MotherboardFormFactor.ATX));
    }

    public void buildGAMEMAXFortressTemperedGlass(SystemCaseBuilder builder) {
        builder
                .Id(91)
                .Name("GAMEMAX Fortress Tempered Glass")
                .Brand("GAMEMAX")
                .Price(1699)
                .Type(SystemCaseType.MidiTower)
                .FormFactors(Arrays.asList(MotherboardFormFactor.microATX, MotherboardFormFactor.ATX));
    }

    public void buildLianLiLANCOOL215TemperedGlass(SystemCaseBuilder builder) {
        builder
                .Id(92)
                .Name("Lian Li LANCOOL 215 Tempered Glass")
                .Brand("Lian")
                .Price(3199)
                .Type(SystemCaseType.MidiTower)
                .FormFactors(Arrays.asList(MotherboardFormFactor.microATX, MotherboardFormFactor.ATX));
    }
}
