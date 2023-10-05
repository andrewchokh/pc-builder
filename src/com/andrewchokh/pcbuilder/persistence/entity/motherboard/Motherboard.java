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

public class Motherboard {

    private final int id;
    private final String name;
    private final MotherboardFormFactor formFactor;
    private final int ramSlotsAmount;
    private final int m2ConnectorAmount;
    private final Chipset chipset;
    private final Socket socket;
    private final String brand;

    // Primary components for mb
    private final Processor processor;
    private final CoolingDevice coolingDevice;
    private final List<Ram> rams;
    private final List<Drive> drives;

    // Secondary components for mb
    private final VideoCard videoCard;
    private final AudioCard audioCard;

    Motherboard(int id, String name, MotherboardFormFactor formFactor, int ramSlotsAmount, int m2ConnectorAmount, Chipset chipset,
                Socket socket, String brand, Processor processor, CoolingDevice coolingDevice, List<Ram> rams,
                List<Drive> drives, VideoCard videoCard, AudioCard audioCard) {
        this.id = id;
        this.name = name;
        this.formFactor = formFactor;
        this.ramSlotsAmount = ramSlotsAmount;
        this.m2ConnectorAmount = m2ConnectorAmount;
        this.chipset = chipset;
        this.socket = socket;
        this.brand = brand;
        this.processor = processor;
        this.coolingDevice = coolingDevice;
        this.rams = rams;
        this.drives = drives;
        this.videoCard = videoCard;
        this.audioCard = audioCard;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
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

    public String getBrand() {
        return this.brand;
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
}
