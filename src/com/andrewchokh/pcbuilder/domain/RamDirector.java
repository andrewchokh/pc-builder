package com.andrewchokh.pcbuilder.domain;

import com.andrewchokh.pcbuilder.persistence.entity.enums.RamType;
import com.andrewchokh.pcbuilder.persistence.entity.ram.RamBuilder;

public class RamDirector {
    public void buildKingstonDDR48GB(RamBuilder builder) {
        builder
                .Id(30)
                .Name("Kingston DDR4")
                .Type(RamType.DDR4)
                .MemoryAmount(8)
                .Frequency(3200)
                .Brand("Kingston");
    }

    public void buildGoodRAMSODIMMDDR38GB(RamBuilder builder) {
        builder
                .Id(30)
                .Name("GoodRAM SODIMM DDR3")
                .Type(RamType.DDR3)
                .MemoryAmount(8)
                .Frequency(1600)
                .Brand("GoodRAM");
    }
}
