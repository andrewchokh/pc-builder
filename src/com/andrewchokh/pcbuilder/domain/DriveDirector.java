package com.andrewchokh.pcbuilder.domain;

import com.andrewchokh.pcbuilder.persistence.entity.drive.HDDBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.drive.SSDBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.enums.DriveFormFactor;

public class DriveDirector {
    public void buildWesternDigitalBlue1TB64MB35(HDDBuilder builder) {
        builder
                .Id(50)
                .Name("Western Digital Blue 1TB 64MB 3.5")
                .Brand("Western Digital")
                .Price(1699)
                .FormFactor(DriveFormFactor.I35)
                .MemoryAmount(1000)
                .RotationSpeed(7200);
    }

    public void buildKingstonNV23DNAND1TBM2(SSDBuilder builder) {
        builder
                .Id(51)
                .Name("Kingston NV2 3D NAND 1TB M.2")
                .Brand("Kingston")
                .Price(2259)
                .FormFactor(DriveFormFactor.M22280)
                .MemoryAmount(1000)
                .ReadingSpeed(3500)
                .WritingSpeed(2100)
                .NVMeSupport(true);
    }

    public void buildKingstonSSDNowA400TLC480GB25(SSDBuilder builder) {
        builder
                .Id(52)
                .Name("Kingston SSDNow A400 TLC 480GB 2.5")
                .Brand("Kingston")
                .Price(1299)
                .FormFactor(DriveFormFactor.I25)
                .MemoryAmount(480)
                .ReadingSpeed(500)
                .WritingSpeed(450)
                .NVMeSupport(false);
    }
}
