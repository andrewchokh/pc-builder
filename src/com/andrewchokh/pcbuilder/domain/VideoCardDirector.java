package com.andrewchokh.pcbuilder.domain;

import com.andrewchokh.pcbuilder.persistence.entity.enums.VideoCardMemoryType;
import com.andrewchokh.pcbuilder.persistence.entity.videocard.VideoCardBuilder;

public class VideoCardDirector {
    public void buildGigabyteGeForceRTX3060TiGamingOCD6X8192MB(VideoCardBuilder builder) {
        builder
                .Id(40)
                .Name("Gigabyte GeForce RTX 3060 Ti Gaming OC D6X 8192MB")
                .MemoryAmount(8)
                .MemoryType(VideoCardMemoryType.GDDR6X)
                .Brand("Gigabyte");
    }

    public void buildAsusROGGeForceGTX1050TiSTRIXOC4096MB(VideoCardBuilder builder) {
        builder
                .Id(41)
                .Name("Asus ROG GeForce GTX 1050 Ti STRIX OC 4096MB")
                .MemoryAmount(4)
                .MemoryType(VideoCardMemoryType.GDDR5)
                .Brand("Asus");
    }

    public void buildAsusDualRadeonRX6750XTOC12288MB(VideoCardBuilder builder) {
        builder
                .Id(42)
                .Name("Asus Dual Radeon RX 6750 XT OC 12288MB")
                .MemoryAmount(12)
                .MemoryType(VideoCardMemoryType.GDDR6)
                .Brand("Asus");
    }
}
