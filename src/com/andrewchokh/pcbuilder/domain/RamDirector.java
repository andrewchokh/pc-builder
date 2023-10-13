package com.andrewchokh.pcbuilder.domain;

import com.andrewchokh.pcbuilder.persistence.entity.enums.RamMemoryType;
import com.andrewchokh.pcbuilder.persistence.entity.ram.RamBuilder;

public class RamDirector {
    public void buildKingstonDDR516GB5200MhzFURYBeastRGB(RamBuilder builder) {
        builder
                .Id(40)
                .Name("Kingston DDR5 16GB 5200Mhz FURY Beast RGB")
                .Brand("Kingston")
                .Price(2499)
                .Type(RamMemoryType.DDR5)
                .MemoryAmount(16)
                .Frequency(5200);
    }
    public void buildKingstonDDR48GB(RamBuilder builder) {
        builder
                .Id(41)
                .Name("Kingston DDR4")
                .Brand("Kingston")
                .Price(1499)
                .Type(RamMemoryType.DDR4)
                .MemoryAmount(8)
                .Frequency(3200);
    }

    public void buildGoodRAMSODIMMDDR38GB(RamBuilder builder) {
        builder
                .Id(42)
                .Name("GoodRAM SODIMM DDR3")
                .Brand("GoodRAM")
                .Price(659)
                .Type(RamMemoryType.DDR3)
                .MemoryAmount(8)
                .Frequency(1600);
    }
}
