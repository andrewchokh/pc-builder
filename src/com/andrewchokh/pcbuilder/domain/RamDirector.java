package com.andrewchokh.pcbuilder.domain;

import com.andrewchokh.pcbuilder.persistence.entity.enums.RamMemoryType;
import com.andrewchokh.pcbuilder.persistence.entity.ram.RamBuilder;

public class RamDirector {
    public void buildKingstonDDR516GB5200MhzFURYBeastRGB (RamBuilder builder) {
        builder
                .Id(30)
                .Name("Kingston DDR5 16GB 5200Mhz FURY Beast RGB ")
                .Type(RamMemoryType.DDR5)
                .MemoryAmount(16)
                .Frequency(5200)
                .Brand("Kingston");
    }
    public void buildKingstonDDR48GB(RamBuilder builder) {
        builder
                .Id(30)
                .Name("Kingston DDR4")
                .Type(RamMemoryType.DDR4)
                .MemoryAmount(8)
                .Frequency(3200)
                .Brand("Kingston");
    }

    public void buildGoodRAMSODIMMDDR38GB(RamBuilder builder) {
        builder
                .Id(30)
                .Name("GoodRAM SODIMM DDR3")
                .Type(RamMemoryType.DDR3)
                .MemoryAmount(8)
                .Frequency(1600)
                .Brand("GoodRAM");
    }
}
