package com.andrewchokh.pcbuilder.persistence.entity.processor;

import com.andrewchokh.pcbuilder.persistence.entity.enums.GraphicsProcessor;
import com.andrewchokh.pcbuilder.persistence.entity.enums.ProcessorLine;
import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

public class Processor {
    private final int id;
    private final String name;
    private final ProcessorLine line;
    private final Socket socket;
    private final int coreAmount;
    private final int flowAmount;
    private final int frequency;
    private final String brand;

    // Secondary components of processor
    private final GraphicsProcessor graphicsProcessor;

    Processor(int id, String name, ProcessorLine line, Socket socket, int coreAmount, int flowAmount, int frequency, String brand, GraphicsProcessor graphicsProcessor) {
        this.id = id;
        this.name = name;
        this.line = line;
        this.socket = socket;
        this.coreAmount = coreAmount;
        this.flowAmount = flowAmount;
        this.frequency = frequency;
        this.brand = brand;
        this.graphicsProcessor = graphicsProcessor;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public ProcessorLine getLine() {
        return this.line;
    }

    public Socket getSocket() {
        return this.socket;
    }

    public int getCoreAmount() {
        return this.coreAmount;
    }

    public int getFlowAmount() {
        return this.flowAmount;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public String getBrand() {
        return this.brand;
    }

    public GraphicsProcessor graphicsProcessor() {
        return this.graphicsProcessor;
    }
}
