package com.andrewchokh.pcbuilder.console;

import com.andrewchokh.pcbuilder.domain.*;
import com.andrewchokh.pcbuilder.persistence.entity.audiocard.AudioCardBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.computersystemunit.ComputerSystemUnit;
import com.andrewchokh.pcbuilder.persistence.entity.computersystemunit.ComputerSystemUnitBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.coolingdevice.CoolerBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.coolingdevice.CoolingDeviceBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.coolingdevice.WaterCoolingBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.drive.Drive;
import com.andrewchokh.pcbuilder.persistence.entity.drive.DriveBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.drive.HDDBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.drive.SSDBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.motherboard.Motherboard;
import com.andrewchokh.pcbuilder.persistence.entity.motherboard.MotherboardBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.powersupply.PowerSupplyBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.processor.ProcessorBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.ram.Ram;
import com.andrewchokh.pcbuilder.persistence.entity.ram.RamBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.systemcase.SystemCase;
import com.andrewchokh.pcbuilder.persistence.entity.systemcase.SystemCaseBuilder;
import com.andrewchokh.pcbuilder.persistence.entity.videocard.VideoCardBuilder;

import java.util.*;

public class Constructor {

    private static MotherboardBuilder motherboardBuilder;
    private static ProcessorBuilder processorBuilder;
    private static CoolingDeviceBuilder coolingDeviceBuilder;
    private static List<RamBuilder> ramBuilders = new ArrayList<>();
    private static List<DriveBuilder> driveBuilders = new ArrayList<>();
    private static VideoCardBuilder videoCardBuilder;
    private static AudioCardBuilder audioCardBuilder;
    private static PowerSupplyBuilder powerSupplyBuilder;
    private static SystemCaseBuilder systemCaseBuilder;

    private static MotherboardBuilder getMotherboard(int userChoice) {
        var director = new MotherboardDirector();
        var builder = new MotherboardBuilder();

        switch (userChoice) {
            case 1:
                director.buildGigabyteB550MAORUSELITE(builder);
                break;
            case 2:
                director.buildAsusROGSTRIXB650EFGAMING(builder);
                break;
            case 3:
                director.buildAsusPRIMEB660MKD4(builder);
                break;
        }

        return builder.getId() != 0 ? builder : null;
    }

    private static ProcessorBuilder getProcessor(int userChoice) {
        var director = new ProcessorDirector();
        var builder = new ProcessorBuilder();

        switch (userChoice) {
            case 1:
                director.buildAMDRyzen75700X(builder);
                break;
            case 2:
                director.buildCorei513400F(builder);
                break;
            case 3:
                director.buildAMDRyzen97900X(builder);
                break;
            case 4:
                director.buildIntelCorei713700K(builder);
                break;
            case 5:
                director.buildIntelCorei511400F(builder);
                break;
        }

        return builder.getId() != 0 || motherboardBuilder.getSocket() != builder.getSocket()
                ? builder : null;
    }

    private static CoolerBuilder getCooler(int userChoice) {
        var director = new CoolingDeviceDirector();
        var builder = new CoolerBuilder();

        switch (userChoice) {
            case 1:
                director.buildAerocoolCylon4ARGB(builder);
                break;
            case 2:
                director.buildArcticFreezer34eSportsDUO(builder);
                break;
        }

        return builder.getId() != 0 || builder.getSockets().contains(motherboardBuilder.getSocket())
                ? builder : null;
    }

    private static WaterCoolingBuilder getWaterCooling(int userChoice) {
        var director = new CoolingDeviceDirector();
        var builder = new WaterCoolingBuilder();

        switch (userChoice) {
            case 1:
                director.buildArcticFreezer34eSportsDUO(builder);
                break;
        }

        return builder.getId() != 0 || builder.getSockets().contains(motherboardBuilder.getSocket())
                ? builder : null;
    }

    private static RamBuilder getRam(int userChoice) {
        var director = new RamDirector();
        var builder = new RamBuilder();

        switch (userChoice) {
            case 1:
                director.buildKingstonDDR516GB5200MhzFURYBeastRGB(builder);
                break;
            case 2:
                director.buildKingstonDDR48GB(builder);
                break;
            case 3:
                director.buildGoodRAMSODIMMDDR38GB(builder);
                break;
        }

        return builder.getId() != 0 ? builder : null;
    }

    private static HDDBuilder getHDD(int userChoice) {
        var director = new DriveDirector();
        var builder = new HDDBuilder();

        switch (userChoice) {
            case 1:
                director.buildWesternDigitalBlue1TB64MB35(builder);
                break;
            case 2:
                return null;
        }

        return builder.getId() != 0 ? builder : null;
    }

    private static SSDBuilder getSSD(int userChoice) {
        var director = new DriveDirector();
        var builder = new SSDBuilder();

        switch (userChoice) {
            case 1:
                director.buildKingstonSSDNowA400TLC480GB25(builder);
                break;
            case 2:
                if (motherboardBuilder.getM2ConnectorAmount() == 0) return null;
                director.buildKingstonNV23DNAND1TBM2(builder);
                break;
            case 3:
                return null;
        }

        return builder.getId() != 0 ? builder : null;
    }

    private static VideoCardBuilder getVideoCard(int userChoice) {
        var director = new VideoCardDirector();
        var builder = new VideoCardBuilder();

        switch (userChoice) {
            case 1:
                director.buildGigabyteGeForceRTX3060TiGamingOCD6X8192MB(builder);
                break;
            case 2:
                director.buildAsusROGGeForceGTX1050TiSTRIXOC4096MB(builder);
                break;
            case 3:
                director.buildAsusDualRadeonRX6750XTOC12288MB(builder);
                break;
        }

        return builder.getId() != 0 ? builder : null;
    }

    private static AudioCardBuilder getAudioCard(int userChoice) {
        var director = new AudioCardDirector();
        var builder = new AudioCardBuilder();

        switch (userChoice) {
            case 1:
                director.buildHATORCrystal71(builder);
                break;
            case 2:
                director.buildAsusXonarSE(builder);
                break;
            case 3:
                director.buildAsusXonarU7MKII(builder);
                break;
            case 4:
                return null;
        }

        return builder.getId() != 0 ? builder : null;
    }

    private static PowerSupplyBuilder getPowerSupply(int userChoice) {
        var director = new PowerSupplyDirector();
        var builder = new PowerSupplyBuilder();

        switch (userChoice) {
            case 1:
                director.buildMSIMAG650W(builder);
                break;
            case 2:
                director.buildGigabyteP750GM(builder);
                break;
            case 3:
                director.buildCHIEFTECProton600W(builder);
                break;
        }

        return builder.getId() != 0 ? builder : null;
    }

    private static SystemCaseBuilder getSystemCase(int userChoice) {
        var director = new SystemCaseDirector();
        var builder = new SystemCaseBuilder();

        switch (userChoice) {
            case 1:
                director.buildMSIMAGForge100M(builder);
                break;
            case 2:
                director.buildGAMEMAXFortressTemperedGlass(builder);
                break;
            case 3:
                director.buildLianLiLANCOOL215TemperedGlass(builder);
                break;
        }

        return builder.getId() != 0 ? builder : null;
    }

    private static void executeStep1(Scanner scanner) {
        int userChoice;

        System.out.println("""
                Select your motherboard:
                1. Gigabyte B550M AORUS ELITE
                2. Asus ROG STRIX B650E-F GAMING
                3. Asus PRIME B660M-K D4
                """);

        userChoice = scanner.nextInt();
        motherboardBuilder = getMotherboard(userChoice);

        if (motherboardBuilder == null) {
            System.out.println("You have chose an incompatible component! Try again.");
            executeStep1(scanner);
        }
    }

    private static void executeStep2(Scanner scanner) {
        int userChoice;

        System.out.println("""
                Select your processor: 
                1. AMD Ryzen 7 5700X
                2. Core i5-13400F"
                3. AMD Ryzen 9 7900X
                4. Intel Core i7-13700K
                5. Intel Core i5-11400F
                """);

        userChoice = scanner.nextInt();
        processorBuilder = getProcessor(userChoice);

        if (processorBuilder == null) {
            System.out.println("You have chose an incompatible component! Try again.");
            executeStep2(scanner);
        }
    }

    private static void executeStep3(Scanner scanner) {
        int userChoice;

        System.out.println("""
                Select your cooling device type:
                1. Cooler
                2. Water Cooling
                """);

        userChoice = scanner.nextInt();
        if (userChoice == 1) {
            System.out.println("""
                    Select your cooler:
                    1. Aerocool Cylon 4 ARGB
                    2. Arctic Freezer 34 eSports DUO         
                    """);

            userChoice = scanner.nextInt();
            coolingDeviceBuilder = getCooler(userChoice);
        }
        else if (userChoice == 2) {
            System.out.println("""
                    Select your water cooling:
                    1. СВО Asus TUF Gaming LC 240 ARGB        
                    """);

            userChoice = scanner.nextInt();
            coolingDeviceBuilder = getWaterCooling(userChoice);
        }

        if (coolingDeviceBuilder == null) {
            System.out.println("You have chose an incompatible component! Try again.");
            executeStep3(scanner);
        }
    }

    private static void executeStep4(Scanner scanner) {
        int userChoice;

        System.out.println("""
                Select your ram: 
                1. Kingston DDR5 16GB 5200Mhz FURY Beast RGB
                2. Kingston DDR4 8GB 3200Mhz"
                3. GoodRAM SODIMM DDR3
                """);

        userChoice = scanner.nextInt();
        ramBuilders.add(getRam(userChoice));

        if (ramBuilders == null) {
            System.out.println("You have chose an incompatible component! Try again.");
            executeStep4(scanner);
        }

        System.out.println("""
                Enter the amount of RAM sticks
                """);

        userChoice = scanner.nextInt();

        if (userChoice > motherboardBuilder.getRamSlotsAmount() || userChoice <= 0) {
            System.out.println("You have chose an incompatible component! Try again.");
            executeStep4(scanner);
        }

        for (int i = 0; i > userChoice - 1; i++) {
            ramBuilders.add(ramBuilders.get(0));
        }
    }

    private static void executeStep5(Scanner scanner) {
        int userChoice;

        System.out.println("""
                    Select your HDD:
                    1. Western Digital Blue 1TB 64MB 3.5
                    2. No HDD        
                    """);

        userChoice = scanner.nextInt();
        driveBuilders.add(getHDD(userChoice));

        System.out.println("""
                    Select your water cooling:
                    1. Kingston NV2 3D NAND 1TB M.2
                    2. Kingston SSDNow A400 TLC 480GB 2.5
                    3. No SSD
                    """);

        userChoice = scanner.nextInt();
        driveBuilders.add(getSSD(userChoice));

        if (driveBuilders.isEmpty()) {
            System.out.println("You have chose an incompatible component! Try again.");
            executeStep5(scanner);
        }
    }

    private static void executeStep6(Scanner scanner) {
        int userChoice;

        System.out.println("""
                    Select your video card:
                    1. Gigabyte GeForce RTX 3060 Ti Gaming OC D6X 8192MB
                    2. Asus ROG GeForce GTX 1050 Ti STRIX OC 4096MB
                    3. Asus Dual Radeon RX 6750 XT OC 12288MB
                    4. No video card        
                    """);

        userChoice = scanner.nextInt();
        videoCardBuilder = getVideoCard(userChoice);

        if (videoCardBuilder == null && processorBuilder.getGraphicsProcessor() == null) {
            System.out.println("You have chose an incompatible component! Try again.");
            executeStep6(scanner);
        }
    }

    private static void executeStep7(Scanner scanner) {
        int userChoice;

        System.out.println("""
                    Select your audio card:
                    1. HATOR Crystal 7.1
                    2. Asus Xonar SE"
                    3. Asus Xonar U7 MKII
                    4. No audio card        
                    """);

        userChoice = scanner.nextInt();
        audioCardBuilder = getAudioCard(userChoice);

        if (audioCardBuilder == null && userChoice != 4) {
            System.out.println("You have chose an incompatible component! Try again.");
            executeStep7(scanner);
        }
    }

    private static void executeStep8(Scanner scanner) {
        int userChoice;

        System.out.println("""
                    Select your power supply:
                    1. MSI MAG 650W
                    2. Gigabyte P750GM
                    3. CHIEFTEC Proton 600W      
                    """);

        userChoice = scanner.nextInt();
        powerSupplyBuilder = getPowerSupply(userChoice);

        if (powerSupplyBuilder == null) {
            System.out.println("You have chose an incompatible component! Try again.");
            executeStep8(scanner);
        }
    }

    private static void executeStep9(Scanner scanner) {
        int userChoice;

        System.out.println("""
                    Select your system case:
                    1. MSI MAG Forge 100M
                    2. GAMEMAX Fortress Tempered Glass
                    3. Lian Li LANCOOL 215 Tempered Glass
                    """);

        userChoice = scanner.nextInt();
        systemCaseBuilder = getSystemCase(userChoice);

        if (systemCaseBuilder == null) {
            System.out.println("You have chose an incompatible component! Try again.");
            executeStep9(scanner);
        }
    }

    private static int getTotalPrice() {
        return
                motherboardBuilder.getPrice() +
                processorBuilder.getPrice() +
                coolingDeviceBuilder.getPrice() +
                ramBuilders.get(0).getPrice() * ramBuilders.size() +
                driveBuilders.get(0).getPrice() * driveBuilders.size() +
                videoCardBuilder.getPrice() +
                audioCardBuilder.getPrice() +
                powerSupplyBuilder.getPrice() +
                systemCaseBuilder.getPrice();
    }

    public static void getUserConfiguration() {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Choosing motherboard
        executeStep1(scanner);

        // Step 2: Choosing processor
        executeStep2(scanner);

        // Step 3: Choosing cooling device
        executeStep3(scanner);

        // Step 4: Choosing RAMs
        executeStep4(scanner);

        // Step 5: Choosing drives
        executeStep5(scanner);

        // Step 6: Choosing video card
        executeStep6(scanner);

        // Step 7: Choosing audio card
        executeStep7(scanner);

        // Step 8: Choosing power supply
        executeStep8(scanner);

        // Step 9: Choosing system case
        executeStep9(scanner);
    }

    public static ComputerSystemUnit buildPC() {
        Motherboard motherboard;
        SystemCase systemCase;

        List<Ram> rams = new ArrayList<>();
        List<Drive> drives = new ArrayList<>();

        for (RamBuilder ramBuilder : ramBuilders) rams.add(ramBuilder.build());
        for (DriveBuilder driveBuilder : driveBuilders) drives.add(driveBuilder.build());

        motherboard = motherboardBuilder
                .Processor(processorBuilder.build())
                .CoolingDevice(coolingDeviceBuilder.build())
                .Rams(rams)
                .Drives(drives)
                .VideoCard(videoCardBuilder != null ? videoCardBuilder.build() : null)
                .AudioCard(audioCardBuilder != null ? audioCardBuilder.build() : null)
                .build();
        systemCase = systemCaseBuilder
                .PowerSupply(powerSupplyBuilder.build())
                .build();

        return new ComputerSystemUnitBuilder()
                .Motherboard(motherboard)
                .SystemCase(systemCase)
                .Price(getTotalPrice())
                .build();
    }
}
