package com.andrewchokh.pcbuilder.persistence.entity.processor;

import com.andrewchokh.pcbuilder.persistence.entity.enums.GraphicsProcessor;
import com.andrewchokh.pcbuilder.persistence.entity.enums.ProcessorLine;
import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

import java.util.Objects;
import java.util.stream.Stream;

public class ProcessorBuilder {
    private int id;
    private String name;
    private String brand;
    private int price;
    private ProcessorLine line;
    private Socket socket;
    private int coreAmount;
    private int flowAmount;
    private int frequency;


    // Secondary components of processor
    private GraphicsProcessor graphicsProcessor;

    public ProcessorBuilder Id(final int id) {
        this.id = id;
        return this;
    }

    public ProcessorBuilder Name(final String name) {
        this.name = name;
        return this;
    }

    public ProcessorBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }

    public ProcessorBuilder Price(final int price) {
        this.price = price;
        return this;
    }

    public ProcessorBuilder Line(final ProcessorLine line) {
        this.line = line;
        return this;
    }

    public ProcessorBuilder Socket(final Socket socket) {
        this.socket = socket;
        return this;
    }

    public ProcessorBuilder CoreAmount(final int coreAmount) {
        this.coreAmount = coreAmount;
        return this;
    }

    public ProcessorBuilder FlowAmount(final int flowAmount) {
        this.flowAmount = flowAmount;
        return this;
    }

    public ProcessorBuilder Frequency(final int frequency) {
        this.frequency = frequency;
        return this;
    }

    public ProcessorBuilder GraphicsProcessor(final GraphicsProcessor graphicsProcessor) {
        this.graphicsProcessor = graphicsProcessor;
        return this;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getPrice() {
        return this.price;
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

    public GraphicsProcessor getGraphicsProcessor() {
        return this.graphicsProcessor;
    }

    public boolean hasAllRequiredFieldsEntered() {
        return Stream.of(id, name, brand, price, line, socket, coreAmount, flowAmount, frequency)
                .allMatch(Objects::nonNull);
    }

    public Processor build() {
        if (!hasAllRequiredFieldsEntered()) throw new RuntimeException("One or several required fields are null");
        return new Processor(id, name, brand, price, line, socket, coreAmount, flowAmount, frequency, graphicsProcessor);
    }
}
