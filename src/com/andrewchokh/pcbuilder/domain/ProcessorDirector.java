package com.andrewchokh.pcbuilder.domain;

import com.andrewchokh.pcbuilder.persistence.entity.enums.GraphicsProcessor;
import com.andrewchokh.pcbuilder.persistence.entity.enums.ProcessorLine;
import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;
import com.andrewchokh.pcbuilder.persistence.entity.processor.ProcessorBuilder;

public class ProcessorDirector {
    public void buildAMDRyzen75700X(ProcessorBuilder builder) {
        builder
                .Id(20)
                .Name("AMD Ryzen 7 5700X")
                .Line(ProcessorLine.AMDRyzen7)
                .Socket(Socket.AM4)
                .CoreAmount(8)
                .FlowAmount(16)
                .Frequency(3400)
                .Brand("AMD");
    }

    public void buildCorei513400F(ProcessorBuilder builder) {
        builder
                .Id(21)
                .Name("Core i5-13400F")
                .Line(ProcessorLine.IntelCorei5)
                .Socket(Socket.LGA1700)
                .CoreAmount(10)
                .FlowAmount(16)
                .Frequency(2500)
                .Brand("Intel");
    }

    public void buildAMDRyzen97900X(ProcessorBuilder builder) {
        builder
                .Id(22)
                .Name("AMD Ryzen 9 7900X")
                .Line(ProcessorLine.AMDRyzen9)
                .Socket(Socket.AM5)
                .CoreAmount(12)
                .FlowAmount(24)
                .Frequency(4700)
                .Brand("AMD")
                .GraphicsProcessor(GraphicsProcessor.RadeonGraphics);
    }

    public void buildIntelCorei713700K(ProcessorBuilder builder) {
        builder
                .Id(23)
                .Name("Intel Core i7-13700K")
                .Line(ProcessorLine.IntelCorei7)
                .Socket(Socket.LGA1700)
                .CoreAmount(12)
                .FlowAmount(24)
                .Frequency(3400)
                .Brand("Intel")
                .GraphicsProcessor(GraphicsProcessor.IntelUHDGraphics770);
    }

    public void buildIntelCorei511400F(ProcessorBuilder builder) {
        builder
                .Id(24)
                .Name("Intel Core i5-11400F")
                .Line(ProcessorLine.IntelCorei5)
                .Socket(Socket.LGA1200)
                .CoreAmount(6)
                .FlowAmount(12)
                .Frequency(2600)
                .Brand("Intel");
    }
}
