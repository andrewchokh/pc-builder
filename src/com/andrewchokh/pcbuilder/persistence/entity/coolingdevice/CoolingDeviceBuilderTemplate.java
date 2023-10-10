package com.andrewchokh.pcbuilder.persistence.entity.coolingdevice;

import com.andrewchokh.pcbuilder.persistence.entity.enums.Socket;

import java.util.List;

public interface CoolingDeviceBuilderTemplate {
    default CoolingDeviceBuilderTemplate Id(final int id) {
        return this;
    }

    default CoolingDeviceBuilderTemplate Name(final String name) {
        return this;
    }

    default CoolingDeviceBuilderTemplate Sockets(final List<Socket> sockets) {
        return this;
    }

    default CoolingDeviceBuilderTemplate FanAmount(final int fanAmount) {
        return this;
    }

    default CoolingDeviceBuilderTemplate Brand(final String brand) {
        return this;
    }
}
