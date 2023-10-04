package com.andrewchokh.pcbuilder.persistence.entity.enums;

public enum FormFactor {
    microATX("microATX"),
    ATX("ATX");

    private final String formFactor;

    FormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return formFactor;
    }
}
