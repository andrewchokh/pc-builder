package com.andrewchokh.pcbuilder.domain;

import com.andrewchokh.pcbuilder.persistence.entity.audiocard.AudioCardBuilder;

public class AudioCardDirector {
    public void buildHATORCrystal71(AudioCardBuilder builder) {
        builder
                .Id(70)
                .Name("HATOR Crystal 7.1")
                .Brand("HATOR")
                .Price(399)
                .SignalToNoiseRatio(93.6f)
                .BitDepth(16);
    }

    public void buildAsusXonarSE(AudioCardBuilder builder) {
        builder
                .Id(71)
                .Name("Asus Xonar SE")
                .Brand("Asus")
                .Price(1499)
                .SignalToNoiseRatio(116f)
                .BitDepth(24);
    }

    public void buildAsusXonarU7MKII(AudioCardBuilder builder) {
        builder
                .Id(72)
                .Name("Asus Xonar U7 MKII")
                .Brand("Asus")
                .Price(3600)
                .SignalToNoiseRatio(114f)
                .BitDepth(24);
    }
}
