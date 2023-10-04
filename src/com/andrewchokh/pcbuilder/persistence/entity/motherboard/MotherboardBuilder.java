package com.andrewchokh.pcbuilder.persistence.entity.motherboard;

import com.andrewchokh.pcbuilder.persistence.entity.enums.FormFactor;
import com.andrewchokh.pcbuilder.persistence.entity.enums.Chipset;
import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;
import com.andrewchokh.pcbuilder.persistence.entity.processor.Processor;
import com.andrewchokh.pcbuilder.persistence.entity.CoolingDevice;
import com.andrewchokh.pcbuilder.persistence.entity.ram.Ram;
import com.andrewchokh.pcbuilder.persistence.entity.drive.Drive;
import com.andrewchokh.pcbuilder.persistence.entity.VideoCard;
import com.andrewchokh.pcbuilder.persistence.entity.AudioCard;

import java.util.List;

public class MotherboardBuilder {

    private int id;
    private String name;
    private FormFactor formFactor;
    private int ramSlotsAmount;
    private boolean m2Connector;
    private Chipset chipset;

    private Socket socket;
    private String manufacturer;

    // Primary components for mb
    private Processor processor;
    private CoolingDevice coolingDevice;
    private List<Ram> rams;
    private List<Drive> drives;

    // Secondary components for mb
    private VideoCard videoCard;
    private AudioCard audioCard;

    public MotherboardBuilder Id(final int id) {
        this.id = id;
        return this;
    }
    public MotherboardBuilder Name(final String name) {
        this.name = name;
        return this;
    }

    public MotherboardBuilder FormFactor(final FormFactor formFactor) {
        this.formFactor = formFactor;
        return this;
    }

    public MotherboardBuilder RamSlotsAmount(final int ramSlotsAmount) {
        this.ramSlotsAmount = ramSlotsAmount;
        return this;
    }

    public MotherboardBuilder M2Connector(final boolean m2Connector) {
        this.m2Connector = m2Connector;
        return this;
    }

    public MotherboardBuilder Chipset(final Chipset chipset) {
        this.chipset = chipset;
        return this;
    }

    public MotherboardBuilder Socket(final Socket socket) {
        this.socket = socket;
        return this;
    }

    public MotherboardBuilder Manufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public MotherboardBuilder Processor(final Processor processor) {
        this.processor = processor;
        return this;
    }

    public MotherboardBuilder CoolingDevice(final CoolingDevice coolingDevice) {
        this.coolingDevice = coolingDevice;
        return this;
    }

    public MotherboardBuilder Rams(final List<Ram> rams) {
        this.rams = rams;
        return this;
    }

    public MotherboardBuilder Drives(final List<Drive> drives) {
        this.drives = drives;
        return this;
    }

    public MotherboardBuilder VideoCard(final VideoCard videoCard) {
        this.videoCard = videoCard;
        return this;
    }

    public MotherboardBuilder AudioCard(final AudioCard audioCard) {
        this.audioCard = audioCard;
        return this;
    }

    public Motherboard build() {
        return new Motherboard(id, name, formFactor, ramSlotsAmount, m2Connector, chipset, socket, manufacturer, processor,
                coolingDevice, rams, drives, videoCard, audioCard);
    }
}
