package com.andrewchokh.pcbuilder;

import com.andrewchokh.pcbuilder.console.Constructor;
import com.andrewchokh.pcbuilder.persistence.entity.computersystemunit.ComputerSystemUnit;

public class Main {
    public static void main(String[] args) {
        Constructor.getUserConfiguration();
        ComputerSystemUnit csu = Constructor.buildPC();

        System.out.println(csu.getMotherboard().getName());
    }
}