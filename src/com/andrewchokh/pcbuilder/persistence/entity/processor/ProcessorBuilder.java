package com.andrewchokh.pcbuilder.persistence.entity.processor;

import com.andrewchokh.pcbuilder.persistence.entity.enums.GraphicsProcessor;
import com.andrewchokh.pcbuilder.persistence.entity.enums.Line;
import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

public class ProcessorBuilder {
    private int id;
    private String name;
    private Line line;
    private Socket socket;
    private int coreAmount;
    private int flowAmount;

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

    public ProcessorBuilder Line(final Line line) {
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

    public ProcessorBuilder GraphicsProcessor(final GraphicsProcessor graphicsProcessor) {
        this.graphicsProcessor = graphicsProcessor;
        return this;
    }

    public Processor build() {
        return new Processor(id, name, line, socket, coreAmount, flowAmount, graphicsProcessor);
    }
}
