package com.andrewchokh.pcbuilder.persistence.entity.enums;

public enum GraphicsProcessor {
    RadeonGraphics("Radeon Graphics"),
    IntelUHDGraphics770("Intel UHD Graphics 770");

    private final String graphicsProcessor;

    GraphicsProcessor(String graphicsProcessor) {
        this.graphicsProcessor = graphicsProcessor;
    }

    @Override
    public String toString() {
        return graphicsProcessor;
    }
}
