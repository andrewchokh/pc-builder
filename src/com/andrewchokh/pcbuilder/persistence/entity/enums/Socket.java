package com.andrewchokh.pcbuilder.persistence.entity.enums;

public enum Socket {
    AM4("AM4"),
    LGA1700("LGA1700"),
    AM5("AM5");

    private final String socket;

    Socket(String socket) {
        this.socket = socket;
    }

    @Override
    public String toString() {
        return socket;
    }
}
