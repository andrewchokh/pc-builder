package com.andrewchokh.pcbuilder.persistence.entity.motherboard;

import com.andrewchokh.pcbuilder.persistence.entity.enums.MotherboardFormFactor;
import com.andrewchokh.pcbuilder.persistence.entity.enums.Chipset;
import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;
import com.andrewchokh.pcbuilder.persistence.entity.processor.Processor;
import com.andrewchokh.pcbuilder.persistence.entity.coolingdevice.CoolingDevice;
import com.andrewchokh.pcbuilder.persistence.entity.ram.Ram;
import com.andrewchokh.pcbuilder.persistence.entity.drive.Drive;
import com.andrewchokh.pcbuilder.persistence.entity.videocard.VideoCard;
import com.andrewchokh.pcbuilder.persistence.entity.audiocard.AudioCard;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class MotherboardBuilder {

    private int id;
    private String name;
    private String brand;
    private int price;
    private MotherboardFormFactor formFactor;
    private int ramSlotsAmount;
    private int m2ConnectorAmount;
    private Chipset chipset;
    private Socket socket;

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

    public MotherboardBuilder Brand(final String brand) {
        this.brand = brand;
        return this;
    }

    public MotherboardBuilder Price(final int price) {
        this.price = price;
        return this;
    }

    public MotherboardBuilder FormFactor(final MotherboardFormFactor formFactor) {
        this.formFactor = formFactor;
        return this;
    }

    public MotherboardBuilder RamSlotsAmount(final int ramSlotsAmount) {
        this.ramSlotsAmount = ramSlotsAmount;
        return this;
    }

    public MotherboardBuilder M2ConnectorAmount(final int m2ConnectorAmount) {
        this.m2ConnectorAmount = m2ConnectorAmount;
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

    public MotherboardFormFactor getFormFactor() {
        return this.formFactor;
    }

    public int getRamSlotsAmount() {
        return this.ramSlotsAmount;
    }

    public int getM2ConnectorAmount() {
        return this.m2ConnectorAmount;
    }

    public Chipset getChipset() {
        return this.chipset;
    }

    public Socket getSocket() {
        return this.socket;
    }

    public Processor getProcessor() {
        return this.processor;
    }

    public CoolingDevice getCoolingDevice() {
        return this.coolingDevice;
    }

    public List<Ram> getRams() {
        return this.rams;
    }

    public List<Drive> getDrives() {
        return this.drives;
    }

    public VideoCard getVideoCard() {
        return this.videoCard;
    }

    public AudioCard getAudioCard() {
        return this.audioCard;
    }

    public boolean hasAllRequiredFieldsEntered() {
        return Stream.of(id, name, brand, price, formFactor, ramSlotsAmount, m2ConnectorAmount, chipset, socket, processor,
                coolingDevice, rams, drives)
                .allMatch(Objects::nonNull);
    }

    public Motherboard build() {
        if (!hasAllRequiredFieldsEntered()) throw new RuntimeException("One or several required fields are null");
        return new Motherboard(id, name, brand, price, formFactor, ramSlotsAmount, m2ConnectorAmount, chipset, socket, processor,
                coolingDevice, rams, drives, videoCard, audioCard);
    }
}
