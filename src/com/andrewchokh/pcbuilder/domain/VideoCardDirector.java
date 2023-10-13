package com.andrewchokh.pcbuilder.domain;

import com.andrewchokh.pcbuilder.persistence.entity.enums.VideoCardMemoryType;
import com.andrewchokh.pcbuilder.persistence.entity.videocard.VideoCardBuilder;

public class VideoCardDirector {
    public void buildGigabyteGeForceRTX3060TiGamingOCD6X8192MB(VideoCardBuilder builder) {
        builder
                .Id(60)
                .Name("Gigabyte GeForce RTX 3060 Ti Gaming OC D6X 8192MB")
                .Brand("Gigabyte")
                .Price(16199)
                .MemoryAmount(8)
                .MemoryType(VideoCardMemoryType.GDDR6X);
    }

    public void buildAsusROGGeForceGTX1050TiSTRIXOC4096MB(VideoCardBuilder builder) {
        builder
                .Id(61)
                .Name("Asus ROG GeForce GTX 1050 Ti STRIX OC 4096MB")
                .Brand("Asus")
                .Price(5449)
                .MemoryAmount(4)
                .MemoryType(VideoCardMemoryType.GDDR5);
    }

    public void buildAsusDualRadeonRX6750XTOC12288MB(VideoCardBuilder builder) {
        builder
                .Id(62)
                .Name("Asus Dual Radeon RX 6750 XT OC 12288MB")
                .Brand("Asus")
                .Price(11199)
                .MemoryAmount(12)
                .MemoryType(VideoCardMemoryType.GDDR6);
    }
}
